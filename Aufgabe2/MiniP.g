grammar MiniP;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	SLIST;
	IDLIST;
	MAIN;
	DECLS;
}

main : PROGRAM declarations BEGIN statements END -> ^(MAIN declarations statements);

declarations:	declaration+ -> ^(DECLS declaration+);

declaration: TYPE ID (COMMA ID)* SEMICOL -> ^(TYPE ID)+;

//ids : ID (COMMA ID)* -> (ID declaration);

var_def : ID DEF expression -> ^(DEF ID expression)
;

expression: BOOL -> BOOL | STRING -> STRING | ar_exp -> ar_exp;

BOOL : 'true' | 'false';

ifStmt : 'if'^ (BOOL | cmp ) thenStmt elseStmt 'fi'!;

thenStmt: 'then'^ statements;

elseStmt: ('else'^ statements)?;	

whileStmt: 'while'^ (BOOL | cmp) doStmt 'od'!;

doStmt: 'do'^ statements;

io_stmt: ('print' | 'println' | 'read')^ '('! expression ')'!;

ar_exp: product (STRICH_OP^ product)* ;

product: ar_term (PUNKT_OP^ ar_term)*;

ar_term: ID | numberconst | '('! ar_exp ')'!;

cmp: ar_exp RELOP^ ar_exp;

statement: ifStmt| whileStmt| io_stmt| var_def;

statements: (statement^ SEMICOL!)+;

numberconst: INT -> INT	| FLOAT -> FLOAT;

DEF: ':=';

PUNKT_OP: ('*' | '/');
    
STRICH_OP: ('+' | '-');

RELOP: ('=' | '<>' | '<' | '<=' | '>' | '>=');

PROGRAM: 'program';

BEGIN: 'begin';

END: 'end';

TYPE: ('integer' | 'string' | 'real' | 'boolean');

SEMICOL: ';';

COMMA: ',';

FLOAT: ('0'..'9')+ '.' ('0'..'9')*;
    
INT: ('0'..'9')+;

STRING: '"' ('a'..'z'|'A'..'Z' | ' ' | '0'..'9')* '"';

ID: ('a'..'z' | 'A'..'Z') ('0'..'9' | ('a'..'z' | 'A'..'Z') |'_')*;

COMMENT: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

WS: ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};

fragment
DIGIT: ('0'..'9');

fragment
LETTER: ('a'..'z' | 'A'..'Z');
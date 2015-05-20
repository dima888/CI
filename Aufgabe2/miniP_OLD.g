grammar miniP;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens {
	START;
	DEKLARATIONEN;
	DEF;
	ANWEISUNGEN;
	ZUWEISUNG;
}

miniP 	:	
	'program' deklarationen 'begin' anweisungen 'end' -> ^(START deklarationen anweisungen);

deklarationen
	:	deklaration* -> ^(DEKLARATIONEN deklaration*);
	
deklaration	
	:	dataType Identifier (INSTRUCTION_NEXT Identifier)* INSTRUCTION_END -> ^(DEF dataType Identifier);	
	
anweisungen
	:	anweisung* -> ^(ANWEISUNGEN anweisung*);	

anweisung
	:	( zuweisung | read_statement | print_statement | if_statement | while_statement );
	
zuweisung
	:	Identifier ALLOCATE value INSTRUCTION_END -> ^(ALLOCATE Identifier value);

dataType
	:	('integer' | 'real' | 'string' | 'boolean');	

arithmetic_operators
	:	ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION | CLAMP_OPEN | CLAMP_CLOSE;

// TODO: Bis jetzt kann man nur einen String und Integer etwas zuweisen
// Kann nur direkt ('true' | 'false') rein schreiben, andere Schreibweise klappt bei mir nicht
value
	:	( (arithmetic_operators)? | String_value | Integer_value | ('true' | 'false') | Real_vlaue |  Compare_operators) ;
					//('0' | ( ('1'..'9') ('0'..'9')* ) ) 

if_statement
	:	'if'^ compare then_statement (else_statement)? 'fi';
	
then_statement 	:	'then' ( deklarationen | anweisungen );
	
else_statement	:	'else' ( deklarationen | anweisungen );

while_statement 
	:	'while'^ compare my_do My_od;
	
my_do	:	'do' ( deklarationen | anweisungen );

read_statement 
	:	'read'^ CLAMP_OPEN Identifier CLAMP_CLOSE INSTRUCTION_END;
	
print_statement
	:	'println'^ CLAMP_OPEN ( Identifier | String_value) CLAMP_CLOSE INSTRUCTION_END; 

// TODO: Bis jetzt können zwei Integer Werte sowie zwei Integerwerte in Variablen mit einander verglichen werden!
compare	:	
	(Integer_value Compare_operators Integer_value) | (Identifier Compare_operators Identifier); 

My_od	:	'od';
Identifier	:	('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
INSTRUCTION_NEXT:	',';
INSTRUCTION_END	:	';';	

/*  
Real_value	: 'KEINE AHNUNG';

Boolean_value   : ('true' | 'false');	
*/

Integer_value	: ('0' | ( ('1'..'9') ('0'..'9')* ) ) ;		  
String_value	: '\'' ( ~('\\'|'\'') )* '\'';
Real_vlaue 	: ('0' | ( ('1'..'9') ('0'..'9')* ) ) '.' ('0'..'9')+;

//True_or_False	: ('true' | 'false');


ALLOCATE  	: ':=';
Compare_operators 
	: '=' | '<>' | '<' | '>' | '<=' | '>=';
	

ADDITION	:	'+';
SUBTRACTION 	:	'-';
MULTIPLICATION	:	'*';
DIVISION	 :	'/';
CLAMP_OPEN	:	'(';
CLAMP_CLOSE	:	')';

CommentHidden       :   	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
HiddenCondition : (' '|'\t'|'\n'|'\r') + {$channel=HIDDEN;};




//Quellen: Zum String 
//http://www.antlr3.org/pipermail/antlr-interest/2011-September/042650.html

		

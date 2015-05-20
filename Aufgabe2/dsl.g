grammar dsl;

// http://stackoverflow.com/questions/4931346/how-to-output-the-ast-built-using-antlr/4933963#4933963
// http://www.antlr.org/wiki/display/ANTLR3/Tree+construction


options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens{
	RAETSEL;
	WORT;
	}

statement
	:	w1=wort 	op1=OP 		w2=wort 	zw=ZUW 		w3=wort 	
	
				op4=OP 		op5=OP 		op6=OP 				
				
		w4=wort 	op2=OP 		w5=wort 	zw=ZUW 		w6=wort 	
		
				zw=ZUW 		zw=ZUW 		zw=ZUW 			
				
		w7=wort 	op3=OP 		w8=wort 	zw=ZUW 		w9=wort 
		
		-> ^(RAETSEL 	^($zw ^($op1 $w1 $w2) $w3) 
				^($zw ^($op2 $w4 $w5) $w6) 
				^($zw ^($op3 $w7 $w8) $w9) 
				^($zw ^($op4 $w1 $w4) $w7) 
				^($zw ^($op5 $w2 $w5) $w8) 
				^($zw ^($op6 $w3 $w6) $w9))
		;

wort	
	:	ID+ 	-> ^(WORT ID+)
	;


// Token
ID	:	('A'..'Z'|'a'..'z'); 
OP	:	('+' | '-');
ZUW	:	'=';

HiddenCondition : (' '|'\t'|'\n'|'\r') + {$channel=HIDDEN;};

grammar dsl;

programm 
	: expression operationSeries expression allocationSeries expression;
	
expression 
	: blockSeries Operator blockSeries Allocate blockSeries;
	
operationSeries 
	:  Operator Operator Operator;
	
allocationSeries 
	: Allocate Allocate Allocate;
	
blockSeries 
	:	Char+;

Char	:	('A' .. 'Z');
Operator:	('+' | '-');
Allocate:	'=';
HiddenCondition : (' '|'\t'|'\n'|'\r') + {$channel=HIDDEN;};
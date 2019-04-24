grammar Lisp;
file: expr+;
expr: define                    #define_expr
       | ifexpr                 #if_expr
	   | lambda                 #lambda_expr
	   | begin                  #begin_expr
	   | self                   #self_expr
	   | compound               #compound_expr
	   ;
	   
define : '('  'define'   ID  INT ')' ;
ifexpr: '('  'if' expr   expr  'else'  expr ')';
lambda: '(' 'lambda' ')';
begin: '(' 'begin'  expr+ ')';
self: ID                        #self_id 
     | INT                      #self_int
	 ;
compound: '(' op  args ')';
op: expr;
args: expr;
	 
ID: [a-zA-Z]+;
INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;
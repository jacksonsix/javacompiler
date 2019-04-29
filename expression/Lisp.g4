grammar Lisp;
file: expr+;
expr: define                    #define_expr
       | ifexpr                 #if_expr
	   | lambda                 #lambda_expr
	   | begin                  #begin_expr
	   | self                   #self_expr
	   | compound               #compound_expr
	   | setexpr                #set_expr
	   ;
	   
define : '('  'define'   ID  expr ')' ;
setexpr : '('  'set'   ID  expr ')' ;
ifexpr: '('  'if' expr   expr  'else'  expr ')';
lambda: '(' 'lambda' '(' formalParas?  ')'  expr* ')';
begin: '(' 'begin'  expr+ ')';
self: ID                        #self_id 
     | INT                      #self_int
	 ;
compound: '(' op  args? ')';
op: expr          #lambda_comp
   | ID           #proc_name_comp
   | SPECIAL      #proc_num_comp
   ;
args: expr ( expr)*;
formalParas: formalPara ( formalPara)* ;
formalPara: ID;
	 
ID: [a-zA-Z]+;
INT : [0-9]+;
SPECIAL : '+' 
        | '-'
        | '*'
        | '/'
        ;
WS : [ \t\r\n]+ -> skip;

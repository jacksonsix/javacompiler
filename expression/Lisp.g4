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
ifexpr: '('  'if' expr   expr    expr ')';
lambda: '(' 'lambda' '(' formalParas?  ')'  expr* ')';
begin: '(' 'begin'  expr+ ')';
self: ID                        #self_id 
     | NUMBER                      #self_int
	 ;
compound: '(' op  args? ')';
op: expr          #lambda_comp
   | ID           #proc_name_comp
   | SPECIAL      #proc_num_comp
   ;
args: expr ( expr)*;
formalParas: formalPara ( formalPara)* ;
formalPara: ID;
	 
ID: ID_LETTER (ID_LETTER | DIGIT)*;
fragment ID_LETTER: [A-Za-z_];

NUMBER:INT
      |FLOAT
      ;
      
INT : DIGIT+;
FLOAT: '.' DIGIT+
     | DIGIT+ '.' DIGIT*
     ;
fragment DIGIT:[0-9];
LINE_COMMENT: ';'  .*? '\n'  ->skip;
STRING: '"' (ESC | .)*? '"';
fragment ESC: '\\' [btnr"\\];
 
SPECIAL : '+' 
        | '-'
        | '*'
        | '/'
        | '='
        ;
WS : [ \t\r\n]+ -> skip;

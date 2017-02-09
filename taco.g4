grammar taco;

program:    '{' (statement)+ '}';
statement   :;
expression  :;


OP          : '+' | '-' | '*' | '/' | '==' ;

NEWLINE : [\r\n]+;
NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
WS      : (' '|'\n') -> skip;




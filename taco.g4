grammar taco;

program:    '{' (statement)+ '}';


statement   : 'if' ' ' expression ' ' statement ' '('else' ' ' statement)?
            | 'for' 'every' ('odd'|'even'|'first' expression|'last' expression|expression) 'item' 'in' NAME
                ;//add more


expression  : INT OP INT
            | NAME OP INT
            | NAME OP NAME
            | INT OP NAME
            | INT
            | NAME;//add more


OP          : '+'|'-'|'*'|'/'|'=='|'!='|'>'|'<'|'<='|'>=';

NEWLINE : [\r\n]+;
NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
WS      : (' '|'\n') -> skip;




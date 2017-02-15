grammar taco;

program:    '{' (statement)+ '}';

//if 1=1
// do()
//else
// doElse()
statement   : 'if' WS expression NL statement ('else' NL statement)?
            | 'for' WS 'every' WS('odd'|'even'|'last')? 'item' ' ' 'in' ' ' NAME NL statement '\n'
            | 'do'
                ;//add more

//Expression: Something which evaluates to a value. Example: 1+2/x
//Statement: A line of code which does something. Example: GOTO 100

expression  : INT LOGOP INT
            | NAME LOGOP INT
            | NAME LOGOP NAME
            | INT LOGOP NAME
            | INT
            | NAME;//add more


OP          : '+'|'-'|'*'|'/'|'%'|'('|')';
LOGOP       : '<'|'<='|'='|'!='|'=='|'>='|'>'|'or'|'and'|'not';

NL : [\r\n]+;
NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
//WS      : [ \t\n\r]+;
WS      : ' ';
IGNORE  : '\t' ->skip;// '\t' ;//(' '|'\r'|'\t'|'\u000C'|'\n');


grammar taco;

program:    '{' (statement)+ '}';

//if 1=1
// do()
//else
// doElse()
statement   : 'if' expression statement ('else' statement)?
            | 'for' 'every' ('odd'|'even'|'last')? 'item' ' ' 'in' ' ' NAME NL statement '\n'
            | 'do'
            | block
            | printStatement
                ;//add more

block           : '{' statement* '}';
printStatement  : 'print' expression ';';

//Expression: Something which evaluates to a value. Example: 1+2/x
//Statement: A line of code which does something. Example: GOTO 100

expression  : NAME
            | INT
            | expression MATHOP expression
            | expression LOGOP expression;//add more


MATHOP          : '+'|'-'|'*'|'/'|'%'|'('|')';
LOGOP       : '<'|'<='|'='|'!='|'=='|'>='|'>'|'or'|'and'|'not';

NL      : [\r\n]+;
NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
WS      : [\t\n\r ]+ ->skip;
SPACE     : ' ' ->skip;
//IGNORE  : '\t' ->skip;// '\t' ;//(' '|'\r'|'\t'|'\u000C'|'\n');


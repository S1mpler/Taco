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
            | ass
            | dcl;//add more

block           : '{' statement* '}';
printStatement  : 'show' expression ';';

//Expression: Something which evaluates to a value. Example: 1+2/x
//Statement: A line of code which does something. Example: GOTO 100

expression  : NAME
            | INT
            | '(' expression ')'
            | expression MATHOP expression
            | expression LOGOP expression;//add more

dcl         : type NAME DECL_SIGH expression ';';
ass         : NAME DECL_SIGH expression;

type : 'boolean' | 'int';

MATHOP          : '+'|'-'|'*'|'/'|'%'|'('|')';
LOGOP       : '<'|'<='|'='|'!='|'=='|'>='|'>'|'or'|'and'|'not';
DECL_SIGH   : '<-'; //int a <- 3


//NL      : [\r\n]+ ->skip;
NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
SPACE     : ' ' ->skip;
ENTER   : '\n' ->skip;
RETURN  : '\r' ->skip;
TAB     : '\t' ->skip;
//IGNORE  : '\t' ->skip;// '\t' ;//(' '|'\r'|'\t'|'\u000C'|'\n');


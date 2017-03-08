grammar taco;

program:    NAME '{' (statement)+ '}';

//if 1=1
// do()
//else
// doElse()
statement   : 'if' expression ((block ('else' block)?) | loop )
            | loop
            | printStatement
            | ass
            | dcl;//add more

block           : '{' (statement)* '}';
printStatement  : 'show' expression;

//Expression: Something which evaluates to a value. Example: 1+2/x
//Statement: A line of code which does something. Example: GOTO 100

expression  : NAME                                                  #LiteralStringExpr
            | INT                                                   #LiteralIntExpr
            | leftBracket='(' expr=expression rightBracket=')'      #Brackets
            | leftExpr=expression op=MATHOP rightExpr=expression    #MathExpression
            | leftExpr=expression op=LOGOP rightExpr=expression     #LogExpression;//add more
loop        : ('do' expression 'times') block;

dcl         : type NAME DECL_SIGH expression ';';
ass         : NAME DECL_SIGH expression;

type : 'boolean' | 'int' | 'string';

MATHOP          : '+'|'-'|'*'|'/'|'%'|'('|')';
LOGOP       : '<'|'<='|'='|'!='|'>='|'>'|'or'|'and'|'not';
DECL_SIGH   : '<-'; //int a <- 3

NAME    : [A-Za-z]+;
INT     : [0-9]+;
TEXT    : [A-Za-z0-9]+;
SPACE     : ' ' ->skip;
ENTER   : '\n' ->skip;
RETURN  : '\r' ->skip;
TAB     : '\t' ->skip;


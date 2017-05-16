grammar taco;

program         : NAME '{' (statement)+ '}';

statement       : ifStatement
                | loop
                | printStatement
                | ass
                | dcl;//add more

block           : '{' (statement)* '}';
printStatement  : 'show' expression;
ifStatement     : 'if' condition block;


condition       : leftExpr=expression op=LOGOP rightExpr=expression     #LogExpression;

expression      : NAME                                                  #LoadValue
                | INT                                                   #LiteralIntExpr
                | BOOLEAN                                               #LiteralBoolExpr
                | leftBracket='(' expr=expression rightBracket=')'      #Brackets
                | leftExpr=expression op=MATHOP rightExpr=expression    #MathExpression // 5 + 5
//                | leftExpr=expression op=LOGOP rightExpr=expression     #LogExpression//add more
                | leftExpr=expression op=ANDOR rightExpr=expression     #AndOrExpression; //&& ||

loop            : ('do' expression 'times') block;

ass             : NAME DECL_SIGH expression;
dcl             : type NAME DECL_SIGH expression;

type            : 'boolean' | 'int' | 'string';

MATHOP          : '+'|'-'|'*'|'/'|'%';
LOGOP           : '<'|'<='|'='|'!='|'>='|'>'|'or'|'and'|'not';
DECL_SIGH       : '<-'; //int a <- 3
ANDOR           : '&&' | '||';

NAME            : [A-Za-z]+;
INT             : [0-9]+;
BOOLEAN         : 'true' | 'false' | 'maybe';
SPACE           : ' ' ->skip;
ENTER           : '\n' ->skip;
RETURN          : '\r' ->skip;
TAB             : '\t' ->skip;
lexer grammar GingerLexer;

GINGER
    : 'Ginger'
    ;

BLAH
    : [a-zA-Z']+
    ;

WHITESPACE
    : [ \r\n\t]+    -> skip
    ;

COMMENT
    : .     -> skip
    ;

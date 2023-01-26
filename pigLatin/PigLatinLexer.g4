lexer grammar PigLatinLexer;

VOWELSTART
    : [AaEeIiOoUu][A-Za-z]+
    | [A-Z][A-Za-z']+[A-Za-z]
    ;

PAIRWORD
    : [cstw]'h'[A-Za-z']*[A-Za-z]+
    | 'qu'[a-z]+
    | [bcdfgptw]'r'[a-z]+
    | [bcfgps]'l'[a-z]+
    | 'sc'[a-z]+
    | 'sm'[a-z]+
    | 'sn'[a-z]+
    | 'sp'[a-z]+
    | 'st'[a-z]+
    | 'sw'[a-z]+
    ;

CONSONANTWORD
    : [bcdfghjklmnpqrstvwxyz][a-z][a-z]+
    ;

SMALLWORD
    : [A-Za-z]
    | [A-Za-z][a-z]
    ;

COMMENT
    : .
    ;
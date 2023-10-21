grammar Neodym;

/*
 * ==============================
 * Parser
 * ==============================
 */

/*
 * ==============================
 * Lexer
 * ==============================
 */

//DelimitedComment
//    : '/*' ( DelimitedComment | . )*? '*/'  -> channel(HIDDEN)
//    ;
//
//LineComment
//    : '//' ~[\u000A\u000D]*  -> channel(HIDDEN)
//    ;
//
//WS
//    : [\u0020\u0009\u000C]  -> skip
//    ;
//
//NL
//    : '\u000A' | '\u000D' '\u000A'
//    ;

eval
    :    additionExp
    ;

additionExp
    :    multiplyExp
         ( '+' multiplyExp
         | '-' multiplyExp
         )*
    ;

multiplyExp
    :    atomExp
         ( '*' atomExp
         | '/' atomExp
         )*
    ;

atomExp
    :    Number
    |    '(' additionExp ')'
    ;

Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;

WS
    : [\u0020\u0009\u000C]  -> skip
    ;
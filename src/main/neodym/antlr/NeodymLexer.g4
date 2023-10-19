lexer grammar NeodymLexer;


DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'  -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\u000A\u000D]*  -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]  -> skip
    ;

NL
    : '\u000A' | '\u000D' '\u000A'
    ;
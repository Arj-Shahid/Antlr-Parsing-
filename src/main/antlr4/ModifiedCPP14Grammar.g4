/*
grammar ModifiedCPP14Grammar;

programDefinition:
functionDefinition  EOF;

functionDefinition:
returnType methodName argumentType functionBodyWithBrackets;

functionBodyWithBrackets:
OpenCurlyBracket  functionbodyWithoutBrackets CloseCurlyBracket  ;

functionbodyWithoutBrackets:
(Datatypes|Identifiernondigit|Equals|DIGIT SemiColon functionbodyWithoutBrackets)*;

returnType:
Datatypes | Identifiernondigit ;

methodName:
Identifiernondigit;


argumentType:
 '('(Datatypes Whitespace Identifiernondigit)*')';

Identifiernondigit
   : NONDIGIT
   ;

fragment NONDIGIT
   : [a-zA-Z_]+
   ;

fragment DIGIT
   : [0-9]+
   ;

Whitespace
   : [ \t]+ -> skip
   ;

Newline
   : ('\r' '\n'? | '\n') -> skip
   ;

Hashtag
    : '#' -> skip
    ;

Includedirective
    : 'include'  -> skip
    ;
Datatypes
:   ( Char
     | Bool
     | Int
     | Long
     | Float
     | Double )
     ;

fragment Char
   : 'char'
   ;

fragment Bool
   : 'bool'
   ;

fragment Double
   : 'double'
   ;

fragment Float
   : 'float'
   ;

fragment Int
   : 'int'
   ;

fragment Long
   : 'long'
   ;



MultiLineMacro
    : '#' .*? -> skip
    ;

Directive
    : '#' ~ [\n]* -> skip
    ;

fragment Equals
:
'='
;

fragment OpenRoundBracket
:
'('
;

fragment CloseRoundBracket
:
')'
;

fragment OpenCurlyBracket
:
'{'
;

fragment CloseCurlyBracket
:
'}'
;

fragment SemiColon:
';'
;*/

grammar ModifiedCPP14Grammar;

simpleProgram:
(Identifiernondigit )+ simpleProgram | EOF;


Datatypes
:   ( Char
     | Bool
     | Int
     | Long
     | Float
     | Double
     | Unsigned
     | String) -> skip
     ;

fragment Char
   : 'char'
   ;

fragment Bool
   : 'bool'
   ;

fragment Double
   : 'double'
   ;

fragment Float
   : 'float'
   ;

fragment Int
   : 'int'
   ;

fragment Long
   : 'long'
   ;

fragment Unsigned
    : 'unsigned'
    ;

fragment Signed
    : 'signed'
    ;

fragment String
    : 'string'
    ;

Whitespace
   : [ \t]+ -> skip
   ;

Keywords:
('new'
    | 'class'
    | 'this'
    | 'return'
    | 'if'
    | 'else'
    | 'while'
    | 'for'
    | 'case'
    | 'using'
    | 'namespace'
    | 'std'
    | 'static'
    | 'NULL'
    | 'true'
    | 'false'
    | 'const'
    | 'void' )   -> skip;

Identifiernondigit
   : NONDIGIT
   | Keywords
   ;

identifierdigit
: DIGIT;

DIGIT
   : [0-9]+ -> skip
   ;

fragment NONDIGIT
   : AlphaNum*
   ;

fragment AlphaNum
   : 'a'..'z' | 'A' .. 'Z' | '0'..'9';

OpenRoundBracket
:
'(' -> skip
;

CloseRoundBracket
:
')' -> skip
;

OpenCurlyBracket
:
'{' -> skip
;

CloseCurlyBracket
:
'}' -> skip
;

Newline
   : ('\r' '\n'? | '\n') -> skip
   ;

Symbols:
('='
    | '+'
    | '-'
    | '*'
    | '/'
    | '%'
    | '^'
    | '&'
    | '|'
    | '~'
    | '!'
    | 'not'
    | '<'
    | '>'
    | '=='
    | '!='
    | '<='
    | '>='
    | '&&'
    | 'and'
    | '||'
    | 'or'
    | '++'
    | '--'
    | ','
    | '->*'
    | '->'
    | '(' ')'
    | '[' ']'
    | '+='
    | '-='
    | '*='
    | '/='
    | '%='
    | '^='
    | '&='
    | '|='
    | '<<'
    | '>>'
    | '<<='
    | '>>='
    | '?'
    | ':'
    | '::'
    | '.'
    | '.*'
    | '...'
    | '->*'
    | '->'
    | '\''
    | '"' ) -> skip;


Array:
('[' .*? ']') -> skip;

Semicolon:
';' -> skip ;

MultiLineMacro
    : '#' .*? -> skip
    ;

Directive
    : '#' ~ [\n]* -> skip
    ;

BlockComment
   : '/*' .*? '*/' -> skip
   ;

LineComment
   : '//' ~ [\r\n]* -> skip
   ;

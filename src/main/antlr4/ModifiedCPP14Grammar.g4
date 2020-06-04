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
(IdentifierDigit| Identifiernondigit )+ simpleProgram | EOF;


Datatypes
:   ( Char
     | Bool
     | Int
     | Long
     | Float
     | Double ) -> skip
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
    | 'case')   -> skip;

Identifiernondigit
   : Keywords
   | NONDIGIT
   ;

identifierdigit
: DIGIT;

fragment DIGIT
   : [0-9]+ -> skip
   ;

fragment NONDIGIT
   : [a-zA-Z_]+
   ;


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
 | '*'
 | '+'
 | '-'
 | '>'
 | ':'
 | '~'
 | '&'
 | ',' ) -> skip;

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

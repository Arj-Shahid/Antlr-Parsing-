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

mainProgram:
( NamespacesWithUsing |  NamespacesWithoutUsing | Identifierdigit | Identifiernondigit | FunctionBody)*;

NamespacesWithUsing:
(Using ' ' Namespace ' ' .*? ';') -> skip;

NamespacesWithoutUsing:
(Namespace ' ' .*?  '{') -> skip;

fragment Using:
'using' ;

fragment Namespace:
'namespace' -> skip ;

FunctionBody:
'{' ( ~('{' | '}') | FunctionBody)* '}' -> skip;

Datatypes
:   ( Char
     | Bool
     | Int
     | Long
     | Float
     | Double
     | Unsigned
     | String
     | Short) -> skip
     ;

Identifiernondigit
   : NONDIGIT
   | Keywords
   ;

Identifierdigit
: DIGIT -> skip;

DIGIT
   : [0-9]+
   ;

fragment NONDIGIT
   : [a-zA-Z_]+
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

fragment Short
    : 'short'
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
     | 'std'
     | 'static'
     | 'NULL'
     | 'true'
     | 'false'
     | 'const'
     | 'void'
     | 'while'
     | 'wchar_t'
     | 'volatile'
     | 'virtual'
     | 'typename'
     | 'typeid'
     | 'typedef'
     | 'try'
     | 'throw'
     | 'thread_local'
     | 'template'
     | 'switch'
     | 'struct'
     | 'static_cast'
     | 'static_assert'
     | 'sizeof'
     | 'reinterpret_cast'
     | 'register'
     | 'public'
     | 'operator'
     | 'override'
     | 'private'
     | 'protected'
     | 'public'
     | 'register'
     |  'reinterpret_cast'
     | 'inline'
     | 'mutable'
     | 'new'
     | 'noexcept'
     | 'nullptr'
     | 'enum'
     | 'explicit'
     | 'export'
     | 'extern'
     | 'final'
     | 'friend'
     | 'goto'
     | 'const'
     | 'constexpr'
     | 'const_cast'
     | 'continue'
     | 'decltype'
     | 'default'
     | 'delete'
     | 'do'
     | 'dynamic_cast'
     | 'alignas'
     | 'alignof'
     | 'asm'
     | 'auto'
     | 'break'
     | 'catch'
     | 'case'
     | 'char16_t'
     | 'char32_t') ->  skip;

NonDomainIdentifiers:
(     'theInstance'
     | 'getInstance'
     | '_OK'
     | '_ERROR'
     | '_EEPROM') -> skip
 ;

Atoms:
('a'..'z' | 'A'..'Z') -> skip;

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
    | '"'
    | ')'
     | '(') -> skip;


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
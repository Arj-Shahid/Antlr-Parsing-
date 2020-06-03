grammar ModifiedCPP14Grammar;


identifierNames
:
  Identifier
 | identifierNames Comma Identifier
 ;

Identifier
:
 (  Datatypes
  | Identifiernondigit
  | DIGIT
 )*
;

Comma :
',' ;

fragment Identifiernondigit
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
:   Char
     | Bool
     | Int
     | Long
     | Float
     | Double
     ;

Char
   : 'char' -> skip
   ;

Bool
   : 'bool' -> skip
   ;

Double
   : 'double' -> skip
   ;

Float
   : 'float' -> skip
   ;

Int
   : 'int' -> skip
   ;

Long
   : 'long' -> skip
   ;

Braces
 : ('('
 | ')'
 | '{'
 | '}'  ) -> skip
 ;
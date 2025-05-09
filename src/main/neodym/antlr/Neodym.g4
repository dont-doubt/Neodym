grammar Neodym;

/*
 * ==============================
 * Parser
 * ==============================
 */
prog
    : (NL | member optSeparator)* EOF
    ;

member
    : uniform
    | func
    ;


func
    : type Identifier params funcBody
    | mainFunc
    ;

mainFunc
    : 'main' funcBody
    ;


funcBody
    : '{' (statement | NL)* '}'
    | ASSIGN statement
    ;

params
    : '(' (typedParam (COMMA param)* )? ')'
    ;

param
    : typedParam | Identifier
    ;

typedParam
    : type Identifier
    ;

statement
    : statement1 optSeparator
    ;

statement1
    : variableAccess opPriority7 expr
    ;

expr
    : '(' expr ')'
    | expr opPriority1 expr
    | expr opPriority2 expr
    | expr opPriority3 expr
    | expr opPriority4 expr
    | expr opPriority5 expr
    | expr opPriority6 expr
    | <assoc=right> expr opPriority7 expr
    | Identifier
    ;

variableAccess
    : Identifier (DOT Identifier)*
    ;

// uniform int3 mask
uniform
    : Uniform type Identifier
    ;

// out@1 int3 name
inout
    : (Out | In) (At Number)?
    ;

optSeparator
    : NL | ';'
    ;

number
    : [0-9]+ (DOT [0-9]*)?
    ;

/*
 * ==============================
 * Lexer
 * ==============================
 */

// Keywords

Uniform: 'uniform' ;
In: 'in' ;
Out: 'out' ;
Return: 'return' ;
Break: 'break' ;
GoTo: 'goto' ;


// Types
type
    : Void // As function return type only
    | Int | Int2 | Int3 | Int4
    | UInt | UInt2 | UInt3 | UInt4
    | Float | Float2 | Float3 | Float4
    | Bool | Bool2 | Bool3 | Bool4
    | Double | Double2 | Double3 | Double4
    | Mat22 | Mat23 | Mat24
    | Mat32 | Mat33 | Mat34
    | Mat42 | Mat43 | Mat44
    | DMat22 | DMat23 | DMat24 // GL 4
    | DMat32 | DMat33 | DMat34 // GL 4
    | DMat42 | DMat43 | DMat44 // GL 4
    | Shadow1d | Shadow2d | Shadow3d
    | Texture1d | Texture2d | Texture3d
    | Cubemap | Shadowcube
    | Identifier // For struct support
    ;

Void: 'void' ;

Int:  'int' | 'int1';
Int2: 'int2' ;
Int3: 'int3' ;
Int4: 'int4' ;

UInt:  'uint' | 'uint1' ;
UInt2: 'uint2' ;
UInt3: 'uint3' ;
UInt4: 'uint4' ;

Float:  'float' | 'float1' ;
Float2: 'float2' ;
Float3: 'float3' ;
Float4: 'float4' ;

Bool:  'bool' | 'bool1' ;
Bool2: 'bool2' ;
Bool3: 'bool3' ;
Bool4: 'bool4' ;

Double:  'double' | 'double1' ;
Double2: 'double2' ;
Double3: 'double3' ;
Double4: 'double4' ;


Mat22:  'mat22' | 'mat2' ;
Mat23:  'mat23' ;
Mat24:  'mat24' ;

Mat32:  'mat32' ;
Mat33:  'mat33' | 'mat3' ;
Mat34:  'mat34' ;

Mat42:  'mat42' ;
Mat43:  'mat43' ;
Mat44:  'mat44' | 'mat4' ;


DMat22:  'dmat22' | 'dmat2' ;
DMat23:  'dmat23' ;
DMat24:  'dmat24' ;

DMat32:  'dmat32' ;
DMat33:  'dmat33' | 'dmat3' ;
DMat34:  'dmat34' ;

DMat42:  'dmat42' ;
DMat43:  'dmat43' ;
DMat44:  'dmat44' | 'dmat4' ;


Shadow1d: 'shadow1d' ;
Shadow2d: 'shadow2d' ;
Shadow3d: 'shadow3d' ;

Texture1d: 'texture1d' ;
Texture2d: 'texture2d' ;
Texture3d: 'texture3d' ;

Cubemap: 'cubemap' ;
Shadowcube: 'shadowcube' ;


// Operators

opPriority1
    : POW
    ;

opPriority2
    : DIVIDE | MULT | MOD
    ;

opPriority3
    : PLUS | MINUS
    ;

opPriority4
    : EQUAL | NOT_EQUAL | GREATER | LESSER
    | GREATER_EQ | LESSER_EQ
    ;

opPriority5
    : AND
    ;

opPriority6
    : OR
    ;

opPriority7
    : ASSIGN | A_PLUS | A_MINUS | A_MULT
    | A_DIVIDE | A_POW
    ;

PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIVIDE: '/' ;
MOD: '%' ;
POW: '^' ;

INCR: '++' ;
DECR: '--' ;

NEG: '!' ;

ASSIGN: '=' ;
A_PLUS: '+=' ;
A_MINUS: '-=' ;
A_MULT: '*=' ;
A_DIVIDE: '/=' ;
A_POW: '^=' ;

EQUAL: '==' ;
NOT_EQUAL: '!=' ;
GREATER: '>' ;
LESSER: '<' ;
GREATER_EQ: '>=' ;
LESSER_EQ: '<=' ;

AND: '&&' ;
OR: '||' ;

DOT: '.' ;
COMMA: ',' ;
COLON: ':' ;
AT: '@' ;


// Identifiers

Identifier
    : Letter LetterOrDigit*
    ;

NL
    : '\r'? '\n'
    ;

WS
    : [\u0020\u0009\u000C] -> skip
    ;

fragment Letter
    : [a-zA-Z_$]
    ;

fragment LetterOrDigit
    : Letter | [0-9]
    ;


BlockComment
    : '/*' ( BlockComment | . )*? '*/'  -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\u000A\u000D]*  -> channel(HIDDEN)
    ;
grammar Saludos;

imprimir:
    COMILLA CLASE COMILLA bloque
    ;

    bloque:
     cor_abierto instrucciones*? cor_cerrado
    ;

    cor_abierto:
    CA
    ;

    cor_cerrado:
    CC
    ;


instrucciones:
    impresion
    |declarar
    |asignacion
    |ifelse
    |mientras
    ;

impresion:
    PRINT PAR_A (string | operacion) PAR_C PYC
    ;

string:
    STRING                                                #impreso
    ;

declarar:
        (TIPO AIDI PYC)                                  #guardar
        |
        (TIPO AIDI IG expr PYC)                          #guardar2
        ;

asignacion:
    AIDI IG expr PYC                                          #asignar
    ;

ifelse:
    SI condicion (SINO SI condicion)* (SINO bloque_if)?
    ;

condicion:
    PAR_A expr PAR_C bloque_if
    ;

bloque_if:
    bloque
    ;

mientras:
    MIENTRAS condicion
    ;

operacion:
    expr                                                  #imprmirResu
    ;

expr:
     expr op = (POR|DIV) expr                             #MulDiv
     |expr op = (MAS|MENOS) expr                          #SumRes
     |expr op = (MAY | MEN | MAYI | MENI) expr            #condicional
     |expr op = (IG | DI) expr                            #condicional2
     |expr AND expr                                       #andExpr
     |expr OR expr                                        #orExpr
     |PAR_A expr PAR_C                                    #parentesis
     |INT                                                 #int
     |TRUE                                                #verdadero
     |FALSE                                               #falso
     |AIDI                                                #id
     ;

CommentLine
  :  '#' ~( '\r' | '\n' | '\t' )* -> skip
  ;

  CommentSection
    :  '$''$''$' .*? '#''#''#' -> skip
    ;
CA: '[';
CC:']';
PAR_A: '(';
PAR_C: ')';

COMILLA: '\'';
IG : '=';
POR:'*';
DIV:'/';
MAS:'+';
MENOS:'-';
MAYI:'>=';
MENI:'<=';
DI: '!=';
MAY:'>';
MEN:'<';

OR:'O';
AND:'Y';
TIPO:
    TIPO_ENTERO
    |
    TIPO_FLOTANTE
;
TIPO_ENTERO: 'entero';
TIPO_FLOTANTE: 'flotante';
PRINT:'imprime';
SI: 'SI';
SINO:'SINO' ;
MIENTRAS: 'mientras';
TRUE:'TRUE'  ;
FALSE:'FALSE' ;

STRING : '"' ( ESC | . )*? '"' ;
fragment ESC : '\\' [btnr"\\] ;
CLASE: [A-Z][a-z]+;
AIDI: [a-zA-Z]+;
INT: [0-9]+
         |
         ([0-9]+'.'[0-9]+)
         |
         ('.'[0-9]+)
         ;
PYC: ';';
SALTO: [ \n\t\r] -> skip;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Ejemplo2;

//palabras reservadas
PALABRA_RESERVADA 
	:	'int'|'void'|'while'|'if'|'scanf'|'printf'|'main'
	;

AMP : '&';

BLANCO	:	 (' '|'\r'|'\n'|'\t')+ -> skip
	;

//agrupadores
PARENTESIS 
	:	')'|'('
	;
	 
LLAVES  
	:	 '{'|'}'
	;

//separadores
SEPARADOR 
	:	 ';'|','
	;
	
//operadores
OP_REL  
	:	 '=='|'<'|'>'|'<='|'>='
	;

OP_ASIGN 
	:	 '='
	;

OP_ARIT	
	:	'+'|'-'|'*'|'/'
	;

fragment LETRA : 'a'..'z'|'A'..'Z' ;

fragment DIGITO : '0'..'9';

NUMERO
	:	DIGITO+
	;				

IDENT
	:	(LETRA|'_') (LETRA|DIGITO|'_')*
	;

CADENA
	:	'"' ~'\n'*? '"' 	// resuelve cualquier secuencia de caracteres
					// que no sean fin de linea, en medio de las '"'
	;

COMENTARIO1 
	:	'//' .*? '\n'		// .*? matches anything until the first '\n'/
	;

COMENTARIO2 
	:	'/*' .*? '*/' -> skip	// .*? matches anything until the first '*/'
	;




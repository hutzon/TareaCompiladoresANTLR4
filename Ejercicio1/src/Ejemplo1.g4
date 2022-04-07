/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar Ejemplo1;

// analizador lexico de expresiones aritmeticas basicas;

fragment DIGITO 
	:	'0'..'9'
	;

fragment NUEVA_LINEA 
	:	'\r\n'
	;

BLANCO 	:	(' '|'\t'|NUEVA_LINEA)+ -> skip
	;

NUMERO 	:	(DIGITO)+ ('.'(DIGITO)+)?
	;

OPERADOR 
	:	'+'|'-'|'/'|'*'
	;

PARENTESIS 
	:	'('|')'
	;

SEPARADOR 
	:	';'
	;

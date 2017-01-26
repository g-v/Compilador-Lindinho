grammar Lindinho;

musica : 'musica' informacoes corpo 'fim_musica';

informacoes : clave escala formula ;

formula : base=NUMERO 'x' base2=NUMERO ;

clave : 'fa' | 'sol' ;

corpo : geral_compasso+ ;

geral_compasso : 'abre' 'ritornelo' geral_compasso+ 'fecha' 'ritornelo' | '{' compasso '}' ; 

compasso : nota_figura+ ;

nota_figura : '(' acidente_opcional termo_nota figura_ritmica pontuacao_opcional ')' (repeticao='*' NUMERO)? ;

acidente_opcional : sustenido_bmol_opcional | 'bq' /* bequadro */ | /* epsilon */ ;

termo_nota : nota_oitava+ | 'pausa' ;

figura_ritmica : 'semibreve' | 'minima' | 'seminima' | 'colcheia' 
| 'semicolcheia' | 'fusa' | 'semifusa' ;

escala : nota sustenido_bmol_opcional ('maior' | 'menor')? ;

sustenido_bmol_opcional : '#' | 'b' | /* epsilon */ ;

nota_oitava : nota oitava=NUMERO ;

nota : 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ;

pontuacao_opcional : '.' | /* epsilon */ ;

NUMERO : '-'? ('0'..'9')+ ;

WS : [ \n\t\r]+ -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;


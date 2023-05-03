#include <stdio.h>
#include <string.h>

void main() {
	char ch[] = "une chaine de caracteres";
    	char* p;
	p = strrchr(ch, 'e'); 
	printf("L'adresse du premier 'e' dans la chaîne est : %x\n", p);  
    	printf("Son indice est : %d\n", p-ch);
    	p = strrchr(ch, 'z'); 
    	printf("L'adresse du premier 'z' dans la chaîne est : %x\n", p);  
	printf("Son indice est : %d\n", p-ch);
	char* debut = ch;
	char motif[] = "ne";
	p = strstr(debut, motif);
	while (p != NULL) {  
 		 printf("\"%s\" se trouve en %d dans \"%s\"\n", motif, p-ch+1, ch); 
 		 debut = p + strlen(motif);
  		 p = strstr(debut, motif);
	}
}

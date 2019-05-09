#include <stdio.h>
#define QTE 10

typedef char MON_TYPE;

int main (void) { 
	MON_TYPE tablo[QTE]; 
	printf("Taille du type initial : %d \n",sizeof(MON_TYPE)); 
	printf("Taille de la variable tablo : %d\n",sizeof(tablo));
	printf("Adresse de la variable tablo : %lu\n",&tablo); /* Le 
	compilateur laisse passer a priori cette erreur !!! */
	printf("Adresse du premier élément : %lu\n",&tablo[0]); 
	printf("Adresse du deuxieme élément : %lu\n",&tablo[1]); 
	printf("Taille d'un élément de tablo : %d\n",sizeof(tablo[0]));
}

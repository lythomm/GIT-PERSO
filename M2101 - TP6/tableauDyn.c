#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

#define QTE 1

typedef float MON_TYPE;

int main (void) { 
	MON_TYPE * tablo ;
	tablo = (MON_TYPE *) calloc(QTE, QTE * sizeof(MON_TYPE));
	if (tablo==NULL) { 
	        perror("Echec malloc") ;
	        exit (EXIT_FAILURE) ;
        }
	printf("Taille du type initial : %d \n",sizeof(MON_TYPE)); 
	printf("Taille de la variable tablo : %d\n",sizeof(tablo));
	printf("Adresse de la variable tablo : %lu\n",&tablo); /* Le 
	compilateur laisse passer a priori cette erreur !!! */
	printf("Adresse du premier élément : %lu\n",&tablo[0]); 
	printf("Adresse du deuxieme élément : %lu\n",&tablo[1]); 
	printf("Taille d'un élément de tablo : %d\n",sizeof(tablo[0]));
	printf("Taille de la zone allouée utilisable : %d\n",malloc_usable_size(tablo));
}

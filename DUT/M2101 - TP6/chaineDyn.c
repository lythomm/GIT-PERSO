#include <stdio.h>
#include <malloc.h>
#include <string.h>

typedef struct
{
	long int nbCar;
	char *tab;
} chaineDyn;

chaineDyn creerChaine(const int n);
void detruireChaine(chaineDyn * ch);
void lireChaine(chaineDyn * ch);

int main(void) {
	chaineDyn ch = creerChaine(25);
	printf("addresse de la chaine : %p\n",&ch);
	printf("Taille de la chaine : %d\n",ch.nbCar);
	lireChaine(&ch);
	detruireChaine(&ch);
}	

chaineDyn creerChaine(const int n) {
	chaineDyn ch;
	ch.tab = (char *) malloc(n * sizeof(char));
	ch.nbCar = n;
	return ch;
}

void detruireChaine(chaineDyn * ch) {	
	free(ch->tab);
	ch->nbCar = 0;
} 

void lireChaine(chaineDyn * ch) {
	chaineDyn* chTmp;
	strncpy(ch->tab, chTmp->tab, ch->nbCar);
	scanf("%s", chTmp->tab);
}

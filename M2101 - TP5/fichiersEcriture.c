#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void main() {

	FILE* fic;
	int lgLigne;
	fic = fopen("texte.txt", "w");
	if (fic == NULL) {
		printf("Erreur à l'ouverture du fichier texte\n");
	} else {
		char* ligne = NULL;
		size_t taille = 0;
		printf("Entrer un texte terminé par une ligne vide\n\n");
		lgLigne = getline(&ligne, &taille, stdin);
        	while (lgLigne > 0) {
			fprintf(fic, "%s", ligne);
			lgLigne = getline(&ligne, &taille, stdin);
		}
		free(ligne);
		fclose(fic);
	}
}

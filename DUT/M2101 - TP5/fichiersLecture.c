#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void main() {

	FILE* fic;
	int lgLigne;
	fic = fopen("texte.txt", "r");
	if (fic == NULL) {
		printf("Erreur à l'ouverture du fichier texte\n");
	} else {
		char* ligne = "";
		size_t taille = 0;
        	while (!feof(fic)) {
			printf("%s", ligne);
			getline(&ligne, &taille, fic);
		}
		free(ligne);
		fclose(fic);
	}
}

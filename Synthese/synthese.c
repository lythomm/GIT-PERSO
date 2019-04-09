#include <stdio.h>
#include <string.h>

#include "clients.h"

#define LG_CHAINE 15
#define LG_REP 100

void main() {

    struct client rep[LG_REP]; /* répertoire clients */
    int lgRep;                 /* longueur du répertoire */

    charger(rep, &lgRep, "repertoire1.txt");
    afficher(rep, lgRep);
    afficherPrefixe(rep, lgRep, "Ma");
    ranger(rep, lgRep, "repertoire2.txt");
}

//VOIR COURS STRUCTURE DE DONNEE 

struct client c1;
c1.nom[0] = 'A';
print("%s", c1.prenom);
c1.num = 10;

//dans le main
// Fonction CHARGER
struct client rep[lg
lire la premiere ligne 
chercher la position du deux point avec STRCHR
extraire SUBSTR (extr chaine d'une autre chaine)
le mettre dans rep[0].nom avec STRCOPY
chercher la poisition du deux point+1 
extraire SUBSTR (extr chaine d'une autre chaine)
le mettre dans rep[0].prenom avec STRCOPY
STRTOL (conversion de string) du 3ème argument puis copy dans rep[0].num

Soit atteindre fin du fichier soit atteindre fin du tableau 

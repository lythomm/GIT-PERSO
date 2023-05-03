#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

#define QTE 15
 
typedef int MON_TYPE;
 
int main (void) 
{ 
	// Creer des pointeurs
	MON_TYPE* t1 ; 
  	MON_TYPE* tablo ; 
  	MON_TYPE* t2 ; 
  	MON_TYPE* nouveau ;
	t1 = (MON_TYPE *) malloc (4 * sizeof(MON_TYPE)); 
	if (t1==NULL) { perror("Echec malloc") ; exit (EXIT_FAILURE) ;} 
	 
	tablo= (MON_TYPE *) malloc (QTE * sizeof(MON_TYPE)); 
	if (tablo==NULL) { perror("Echec malloc") ; exit (EXIT_FAILURE) ;} 
	
	t2= (MON_TYPE *) malloc (4 * sizeof(MON_TYPE));  
	if (t2==NULL) { perror("Echec malloc") ; exit (EXIT_FAILURE) ;}  

	printf("\nValeur de la variable t1 : %p\n",t1); 
	printf("Valeur de la variable tablo : %p\n",tablo); 
	printf("Valeur de la variable t2 : %p\n\n",t2);

	nouveau= (MON_TYPE *) realloc (tablo,QTE/10 * sizeof(MON_TYPE)); 
	if (nouveau==NULL) { perror("Echec realloc") ; exit (EXIT_FAILURE) ; }
	if (nouveau==tablo) { printf("Même emplacement \n") ; }  
    		else  { printf("Nouvel emplacement : %p\n",nouveau) ; } 
	printf("Espace utilisable variable tablo : %d\n",
	malloc_usable_size(nouveau)); 

	nouveau= (MON_TYPE *) realloc (tablo,QTE*10 * sizeof(MON_TYPE)); 
	if (nouveau==NULL) { perror("Echec realloc") ; exit (EXIT_FAILURE) ; }
	if (nouveau==tablo) { printf("Même emplacement \n") ; } 
    		else  { printf("Nouvel emplacement %p\n",nouveau) ; }  
	printf("Espace utilisable variable tablo : %d\n",
	malloc_usable_size(nouveau)); 
	free(t1);  
	free(t2);  
	free(tablo);
}

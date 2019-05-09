#include <stdio.h>
#include <string.h>  
#define LG_MAX 15

void main() { 
	char ch[LG_MAX+1] = "Hello";
	printf("longueur=%d, taille=%d\n", strlen(ch), sizeof(ch));
	char ch2[LG_MAX+1];
	strcpy(ch2, ch);
	printf("%s\n", ch2);
	char ch3[LG_MAX+1] = "***************";
	strncpy(ch3, ch,2);
	printf("%s\n", ch3);
        int n, lg;
        strcpy(ch3, "***************");
        printf("entrer le nombre de caractères à copier : ");
        scanf("%d", &n);
        lg = (n > sizeof(ch3)-1) ? sizeof(ch3)-1 : n;
        strncpy(ch3, "abcdefghijklmnopqrstuvwxyz", lg);
        ch3[lg] = '\0';
        printf("%s\n", ch3);
	strcat(ch, "World");
	printf("%s\n", ch);
}

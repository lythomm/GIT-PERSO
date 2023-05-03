#include <stdio.h>
#include <string.h>

void main() {
        char ch1[] = "abcd";
        char ch2[] = "abcd";
        char ch3[] = "xyz";
        if ( (strcmp(ch1, ch2)) == 0) {
                printf("%s = %s\n", ch1, ch2);
        } else {
                if ((strcmp(ch1, ch2)) < 0) {
                        printf("%s < %s\n", ch1, ch2);
                } else {
                        printf("%s > %s\n", ch1, ch2);
                }
        }
        if ((strcmp(ch2, ch3)) == 0) {
                printf("%s = %s\n", ch2, ch3);
        } else {
                if ((strcmp(ch2, ch3)) < 0) {
                        printf("%s < %s\n", ch2, ch3);
                } else {
                        printf("%s > %s\n", ch2, ch3);
                }
        }
        if ((strcmp(ch3, ch1)) == 0) {
                printf("%s = %s\n", ch3, ch1);
        } else {
                if ((strcmp(ch3, ch1)) < 0) {
                        printf("%s < %s\n", ch3, ch1);
                } else {
                        printf("%s > %s\n", ch3, ch1);
                }
        }
}

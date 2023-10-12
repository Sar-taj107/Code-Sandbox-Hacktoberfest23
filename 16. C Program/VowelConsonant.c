#include <stdio.h>
int main(){
    char a;
    printf("Enter the character here");
    scanf("%c",&a);
    a=tolower(a);
    if (a=='a' || a=='e'|| a=='i'||a=='o'||a=='u'){
        printf("%c is vowel",a);
    }
    else 
    printf("%c is a consonant",a);
return 0;
}

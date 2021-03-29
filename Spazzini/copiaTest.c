#include <stdio.h>

char frase[] = "Analisi, requisiti ";

int main(void){
int i;
char discorso[80];
  
for(i=0; (discorso[i]=frase[i])!='\0'; i++){
  printf("Originale: %s \n Copua: %s \n", frase, discorso)
}
  
system("pause");
return 0;
}

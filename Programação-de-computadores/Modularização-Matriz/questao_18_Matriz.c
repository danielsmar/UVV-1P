/* 18) Criar um programa: Função + Protótipo que preencha e exiba uma matriz quadrada 𝑀5𝑋5 com valores aleatórios entre 1 e 9. Após o preenchimento, calcule e exiba dois vetores 𝑉1 e 𝑉2 formados a partir da média da soma dos elementos das respectivas linhas e colunas da Matriz 𝑀, conforme o exemplo:
*/

#include <stdio.h>
#include <time.h>
#include <stdlib.h>



//PROTÓTIPO
int matriz (int LINHAS, int COLUNAS);

//FUNÇÃO
int geradorMatriz(int LINHAS, int COLUNAS){
  srand(time(NULL));

  int matriz[LINHAS][COLUNAS];
  int l, c, i=0, contador=0;
  float V1[5], V2[5];
  float somaV1, somaV2;

//Leitura da matriz
  printf("\nMATRIZ  [%i][%i]:\n", LINHAS, COLUNAS);
  for(l = 0; l < LINHAS; l++){
    for(c = 0; c < COLUNAS; c++){
      matriz[l][c] = 1+(rand() % 9);
      printf("\t%i", matriz[l][c]);        
    }
    printf("\n");     
  }
 // soma dos valores por linha
 printf("\nMEDIA DA SOMA DOS ELEMENTOS DAS LINHAS(V1)");
  for(l = 0; l < LINHAS; l++){
    somaV1=0;
    i++;
    for(c = 0; c < COLUNAS; c++){
      somaV1 = somaV1 + matriz[l][c];
    }
   V1[l]=somaV1/LINHAS; 
   printf("\nLINHA %d: MÉDIA %.2f", i, V1[l]);
  }

// soma dos valores por Coluna
printf("\n\nMEDIA DA SOMA DOS ELEMENTOS DAS COLUNAS(V2)");
  i=0;
  for(c = 0; c < LINHAS; c++){
    somaV2=0;
    i++;
    for(l = 0; l < COLUNAS; l++){
      somaV2 = somaV2 + matriz[l][c];
    }
   V2[c]=somaV2/LINHAS;  
  printf("\nCOLUNA %d: MÉDIA %.2f", i, V2[c]);
  }
  
  //printf("\nV1 %d", somaV1);

 return 0; 
}

int main(void) {
 int LINHAS = 5;
 int COLUNAS = 5;

 
 geradorMatriz(LINHAS,COLUNAS);

  return 0;
}

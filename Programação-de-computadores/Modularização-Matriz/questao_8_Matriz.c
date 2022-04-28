// 8) Dadas duas matrizes de inteiros A e B de ordem 4 x 3, fazer um programa C que gere uma matriz de zeros e uns denominada C, tal que o elemento C[i, j] seja verdadeiro (1 na linguagem C) se os elementos nas posições respectivas das matrizes A e B forem múltiplos e falso (0 na linguagem C), caso contrário. Exibir na tela a matriz C. As matrizes A e B recebem valores inteiros aleatórios, obrigatoriamente pares, no intervalo entre [2, 100].

#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#define LINHAS 4
#define COLUNAS 3

int main(void) {

  srand(time(NULL));

  int matrizA[LINHAS][COLUNAS];
  int i, j, contador=0;

  printf("\nMATRIZ A [%i][%i]:\n", LINHAS, COLUNAS);
  for(i = 0; i < LINHAS; i++){
    for(j = 0; j < COLUNAS; j++){
      matrizA[i][j] = 2+(rand() % 49)*2;
      
      printf("\t%i", matrizA[i][j]);
    }
    printf("\n");
  }

  int matrizB[LINHAS][COLUNAS];  

  printf("\nMATRIZ B [%i][%i]:\n", LINHAS, COLUNAS);
  for(i = 0; i < LINHAS; i++){
    for(j = 0; j < COLUNAS; j++){
      matrizB[i][j] = 2+(rand() % 49)*2;
      
      printf("\t%i", matrizB[i][j]);
    }
    printf("\n");
  }  

  int matrizC[LINHAS][COLUNAS];
  
  printf("\n\n[0] TERMOS NÃO MULTIPLOS [1] TERMOS MULTIPLOS\n");
  printf("\nMATRIZ C [%i][%i]:\n", LINHAS, COLUNAS);
  for(i = 0; i < LINHAS; i++){
    for(j = 0; j < COLUNAS; j++){
			if(matrizA[i][j] % matrizB[i][j] == 0){
        matrizC[i][j]=1;
        printf("\t%i", matrizC[i][j]);
      }
      else{
         matrizC[i][j]=0;
         printf("\t%i", matrizC[i][j]);
      }
    }
    printf("\n");
  }
  return 0;
}

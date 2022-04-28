/*Criar uma função que receba um número inteiro qualquer Positivo e retorne: log𝑁𝜋 se N for PRIMO ou retorne: log𝜋𝑁 se N for NÃO for PRIMO
Na main, use a função 500 vezes para valores de N lidos do usuário (um de cada vez).
*/


#include <stdio.h>
#include <math.h>
#define TAMANHO 500

//PROTÓTIPOS
float Primo (int n);

/*FUNÇÃO*/

float Primo(int n){
  int contador = 0;
  float pi=3.14, resultado; 

  for(int i=1; i <= n; i++){
    if(n%i==0){
      contador++;
    }
  }
  if(contador == 2){          //log pi(3,14) na base n
    resultado = log(pi)/log(n);
    printf("\nO número %d é primo.\n", n);
    printf("log𝑁𝜋: ");
    return resultado;
    
  }
  else{          
    resultado = log(n)/ log(pi);         // log N na base pi(3,14)
    printf("\nO número %d não é primo.\n", n);
    printf("log𝜋𝑁: ");    
    return resultado;
  }

}
 


int main(void) {

  int n;
  int y=  TAMANHO;
  float x;


  for(int i= 0; i<TAMANHO;i++ ){

    printf("\n-----------------------");
    printf("\n\nCALCULO Nº%i de %i \n", i+1, y);
    printf("Digite um número: ");
    scanf("%d", &n);

    if(n<0){
      printf("ERRO: Digite um número maior que zero");
    }
    x=Primo(n);
    printf("%f", x);
  }

  
  return 0;
}

#include <stdio.h>
/* 10)Crie uma função para uma "mini" calculadora (somente de inteiros), ou seja, passe como argumento:
➢ Dois (2) números inteiros: Número1 e Número2 e
➢ Um (1) Operador: Soma ( + ) ou Subtração ( ̶ ) ou Multiplicação ( * ) ou Divisão ( / ) ou MOD ( % )
Retorne desta função a operação matemática solicitada pelo usuário. Na main, use a função em 100 operações matemáticas com valores de Número1, Número2 e Operador lidos do usuário. */

//PROTÓTIPO
int Calculadora(int n1, int n2);

//FUNÇÃO

int Calculadora(int n1, int n2){
  int i = 1;
  int opcao, resultado=0;

  
    
    printf("\n1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO\n5-MOD\n\nOpção: ");
    scanf("%d", &opcao);    

        
    switch(opcao){    
          
      case 1: 
      printf("\nDigite o primeiro número: ");
      scanf("%d", &n1);
    
      printf("\nDigite o segundo número: ");
      scanf("%d", &n2);
      resultado = n1 + n2;      
      break;

      case 2:
      printf("\nDigite o primeiro número: ");
      scanf("%d", &n1);
    
      printf("\nDigite o segundo número: ");
      scanf("%d", &n2);
      resultado = n1 - n2;      
      break;

      case 3:
      printf("\nDigite o primeiro número: ");
      scanf("%d", &n1);
    
      printf("\nDigite o segundo número: ");
      scanf("%d", &n2);
      resultado = n1 * n2;      
      break;

      case 4:
      printf("\nDigite o primeiro número: ");
      scanf("%d", &n1);
    
      printf("\nDigite o segundo número: ");
      scanf("%d", &n2);
      resultado = n1 / n2;      
      break;

      case 5:
      printf("\nDigite o primeiro número: ");
      scanf("%d", &n1);
    
      printf("\nDigite o segundo número: ");
      scanf("%d", &n2);
      resultado = n1 % n2;     
      break;

      default:
      printf("Erro: Digite uma opção válida!");  
          
      break;  
  
    }
    return resultado;
  
}

#define SIZE 100

int main(void) {

  int x, i=0;
  int n1=0, n2=0;

  while(i != SIZE){
    printf("\n------CALCULADORA DE INTEIROS------");
    printf("\nOPERAÇÃO Nº%d\n",i+1);
    x=Calculadora(n1, n2);
    printf("\nResultado: %d\n", x);
    i++;
  }

    
  return 0;
}

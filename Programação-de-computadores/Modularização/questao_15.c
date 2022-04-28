/* 15) Crie uma função e seu protótipo que receba como argumento um ano qualquer e um dos três números citados: 4 ou 100 ou 400 e retorne zero ou um (se o ano for ou não bissexto), quociente e resto da divisão do ano pelo número escolhido, conforme as regras de teste do ano bissexto. Após isso, use a função no programa principal e exiba as informações sobre o ano conforme os dados ditos pelo usuário.
Regras de teste do ano bissexto: ✓ São bissextos todos os anos múltiplos de 400. Exemplo: 1600, 2000, 2400, 2800... ✓ São bissextos todos os múltiplos de 4 e não múltiplos de 100. Exemplo: 1996, 2004, 2008, 2012, 2016… ✓ Não são bissextos todos os demais anos. */


#include <stdio.h>

//PROTÓTIPO
int bissexto (int ano);

//FUNÇÂO
int bissexto (int ano){

  if((ano%4)==0 && (ano%100)!=0){
    printf("\n\nTESTE 1(MULTIPLOS DE 4)");
    printf("\nQuociente: %d | Resto: %d",ano/4, ano%4);
    printf("\n\nTESTE 2(NÃO MULTIPLOS DE 100)");
     printf("\nQuociente: %d | Resto: %d\n\n",ano/100, ano%100);
     printf("\nO Ano Digitado é Bissexto");
    return 0;
  }
  
  else if((ano%400)==0){
    printf("\n\nTESTE (MULTIPLO DE 400)");
    printf("\nQuociente: %d | Resto: %d",ano/400, ano%400);
    printf("\n\nO Ano Digitado é Bissexto");
    return 0;
  }
  
  else  {
  printf("\nO Ano Digitado não é bissexto");
  return 1;
  }
}

int main(void) {
  int ano, x;

  printf("\nDigite um ano Qualquer\n");
  scanf("%d", &ano);
  x= bissexto(ano);
  printf("\n\n[0] Bissexto | [1] Não Bissexto");
  printf("\nResultado: %d\n", x);

  return 0;
}

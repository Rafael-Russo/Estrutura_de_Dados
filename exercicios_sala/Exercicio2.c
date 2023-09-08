#include <stdio.h>

int main(){
	
	int num, valor;
	int *p;
	
	num=55;
	p = &num;
	
	valor = *p;
	
	printf("\n\n%d\n", valor);
	printf("Endereco para onde o ponteiro %p\n", p);
	printf("Valor da variavel apontada> %d\n", *p);
	
	return 0;
}

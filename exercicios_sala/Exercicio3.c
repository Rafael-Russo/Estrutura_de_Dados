#include <stdio.h>

int main(){
	int num, *p;
	
	num = 55;
	p = &num;
	
	printf("\nValor inicial: %d", num);
	
	*p = 100;
	
	printf("\nValor final: %d\n", num);
	
	return 0;
}

#include<stdio.h>

int main(){
	int count = 10;
	int *pt;
	pt=&count;
	
	printf("count = %d\n", count);
	printf("endereco de pt = %p\n", pt);
	printf("conteudo para onde o pt aponta %d\n", *pt);
	
	return 0;
}

#include <stdio.h>
#include <stdlib.h>

int *result;

void Sum(int x,int y){
	int soma;
	soma = x + y;
	result = &soma;
}

int main(){	
	int n1, n2;
	
	printf("Digite o 1 numero:\n");
	scanf("%d", &n1);
	
	printf("Digite o 2 numero:\n");
	scanf("%d", &n2);

	Sum(n1,n2);
	
	printf("%d + %d = %d",n1, n2, *result);
	
	return 0;
}

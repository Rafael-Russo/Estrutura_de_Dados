#include <stdio.h>

void semPonteiro(){
	float mat[50][50];
	int i, j;
	
	for(i=0; i<50; i++){
		for(j=0; j<50; j++){
			mat[i][j] = 0.0;
		}
	}
}

int main(){
	float mat[50][50];
	float *p;
	int count;
	
	p=mat[0];
	
	for(count=0; count<2500; count++){
		*p=0.0;
		p++;
	}
	
	return 0;
}

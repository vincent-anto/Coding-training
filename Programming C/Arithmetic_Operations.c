#include<stdio.h>
void main(){
	int a,b,c;
	printf("\t\t\t Arithmetic operations\n");
	printf("\t\t\t ---------- ----------\n");
	printf("Enter the value of the first integer :");
	scanf("%d",&a);
	printf("\nEnter the value of the second integer :");
	scanf("%d",&b);
	printf("\nAddition value :%d",a+b);
	printf("\nSubtraction value :%d",a-b);
	printf("\nMultiplication value :%d",a*b);
	if(a>b)
		c=a/b;
	else
		c=b/a;
	printf("\nDivition value :%d",c);
}

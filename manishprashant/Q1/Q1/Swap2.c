#include<stdio.h>
#include<conio.h>
int main(){
	int a,b;
	printf("Enter the two numbers");
	scanf_s("%d%d",&a,&b);

	a=a^b;
	b=a^b;
	a=a^b;

	printf("Swapped numbers are : %d %d",a,b);

	_getch();
	return 0;
}
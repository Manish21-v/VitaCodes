#include<stdio.h>
#include<conio.h>
int main(){
	int principal=0,rate=0,time=0;
	int simint=0;
	printf("Enter the principal, rate and time period");
	scanf_s("%d%d%d",&principal,&rate,&time);
	simint=(principal*rate*time)/100;
	printf("\nSimple interest is:%d",simint);
	_getch();
	return 0;
}
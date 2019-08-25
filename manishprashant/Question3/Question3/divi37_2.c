#include<stdio.h>
#include<conio.h>
int main(){

int no;
printf("Enter the number");
scanf_s("%d",&no);

if(no%3==0)
	printf("three");
if(no%7==0)
printf("\tseven");
_getch();
return 0;
}
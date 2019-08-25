#include<stdio.h>
#include<conio.h>
int main(){
	int no;
	printf("Enter the marks");
	scanf_s("%d",&no);
	if(no>=75)
	{
		printf("Grade A");
	}
	else if(no>=55)
	{
		printf("Grade B");
	}
	else if(no>=35)
	{
		printf("Grade C");
	}
	else
		printf("Fail");
	_getch();
	return 0;

}
#include<stdio.h>
#include<conio.h>
int main(){
	int no,count=0;
	printf("Enter the Year is 4 digit format");
	scanf_s("%d",&no);
	while(no!=0){
	no=no/10;
	count++;
	}
	if(count==4){
		if(no%4==0)
		printf("Year is a leap year");
	else
		printf("Year is not a leap year");
	}
	else
		printf("Enter the Year in YYYY format");
	
	_getch();
	return 0;
}
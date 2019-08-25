#include<stdio.h>
#include<conio.h>
int main(){
int no,temp;
printf("Enter the number");
scanf_s("%d",&no);
if((no&1)==0)
{	printf("It is Even");
}
else{
    printf("It is Odd");
}
	_getch();
return 0;

}
#include<stdio.h>
#include<conio.h>
#include"fact.h"
#include"Highest.h"
#include"Sum10.h"
#include"countIntegers.h"
#include"DigitSum.h"
#include"RevDig.h";
#include"Palendrome.h"
#include"Table.h"
#include"DisnxtFive.h"
#include"diviEvenOdd.h"
#include"lowest.h"
#include"secondmax.h"
#include"DigOc.h"
#include"Fibo.h"
#include"disnxtN.h";
 int fact(int);
int main()
{
	//for factorial
	/*int val;
	printf("Enter the number");
	scanf_s("%d",&val);
	printf("Factorial is:%d",(fact(val)));*/

	//****************************************//
	//For highest number
	/*int i,r,no,val;
	printf("Enter the 10 numbers");

	printf("highest no is  :%d",highestno());*/

	//****************************************//
	//For Sum of 10 Number
 /*printf("Sum of 10 Number is:%d",Sum());*/


	//****************************************//
	//For Sum of 10 Number

	//countInt();

	//****************************************//
	//For Sum of digit.
	/*int no;
	printf("Enter the digit");
	scanf_s("%d",&no);
	printf("%d",DigitSum(no));
*/
	//****************************************//
	//For reverse of number.
	/*int no;
	printf("Enter the digit");
	scanf_s("%d",&no);
	printf("%d",RevDig(no));*/

//****************************************//
	//For reverse of number.
	/*int no;
	printf("Enter the digit");
	scanf_s("%d",&no);
	if(Palendrome(no))
	{
		printf("Number is palendrome");
	}
	else{
		printf("number is not palendrome");
	}*/

//****************************************//
	//For reverse of number.
	/*int no;
	printf("Enter the digit");
	scanf_s("%d",&no);
	 Table(no);*/

	//****************************************//
	//For diviEvenOdd

	/*int j,k;
	printf("enter the limit range and divident");
	scanf_s("%d %d",&j,&k);
	diviEvenOdd(j,k);*/


	//****************************************//
	//For minimum no

	//int i,r,no,val;
	//printf("Enter the 10 numbers");

	//printf("lowest no is  :%d",lowestno());

	//****************************************//
	//For second highest
	/*int i;
	printf("enter 10 numbers");
	secondmax();*/

	//****************************************//
	//For digit occurance

	//int no,digit;
	//printf("Enter the Number");
	//scanf_s("%d",&no);
	//printf("Enter the Digit");
	//scanf_s("%d",&digit);
	//printf("%d",DigOc(no,digit));

	//****************************************//
	//For print next 5

	/*int no;
	printf("enter the no");
	scanf_s("%d",&no);
	disnxtFive(no);
*/
	//****************************************//
	//For print next N Number
	int no;
	printf("enter the no");
	scanf_s("%d",&no);
	disnxtN(no);

_getch();
return 0;
}


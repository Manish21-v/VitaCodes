#include<stdio.h>
#include<conio.h>
#include"fact.h"
#include"special.h"
#include"armstrong.h"
#include"cube.h"
#include"table.h"
#include"hcf.h"
#include"tableB.h"
#include"pattern1.h"
#include"pattern2.h"
#include"pattern3.h"
#include"pattern4.h"
#include"pattern5.h"
#include"pattern6.h"
#include"pattern7.h"
#include"pattern10.h"
#include"primeno.h"
#include"primeN.h"
#include"primebt.h"
int main()
{
	//for special number from 1 to 2 lac
	/*int digit;
	specialno();*/

	//armstong no from 100 mto 999
	/*armstrong();*/

	//for table till N number below each other
	/*int num=0;
	printf("Enter the Number");
	scanf_s("%d",&num);
	table(num);*/

	////for table till N number besides eachother
	//int num=0;
	//printf("Enter the Number");
	//scanf_s("%d",&num);
	//tableB(num);

	//for hcf 
	/*int no1=0,no2=0,result=0;
	printf("Enter two numbers for hcf");
	scanf_s("%d %d",&no1,&no2);
	result=hcf(no1,no2);
	printf("Hcf of %d and %d is %d",no1,no2,result);*/

	// for prime no

	/*int r,no;
	printf("Enter the no");
	scanf_s("%d",&no);
	r=primeno(no);
	(r==1)?(printf("no is prime")):(printf("no is not prime"));*/


	
	//printing N number of prime Number
	/*int no1;
	printf("Enter Number to get that number of prime Numbers");
	scanf_s("%d",&no1);
	primeN(no1);*/

	// for prime no btw 50 to 100

	//primebt();


	//pattern printing 1        1
	//				     	    12
	//	                        123
    
   //pattern1();
	
	//pattern printing 2   
		                  /*1
                           22
                           333*/    //pattern2();	//pattern printing 3   
		                  /* 1
                            2 2
                           3 3 3                                */    //pattern3();	//pattern printing 4   
		                  /* 1
                             23
                             456                                */    //pattern4();
	//pattern printing 5   
		                  /*   1
                              12
                             123                                */
	
	//pattern5();	


	//pattern printing 6   
		                  /*   1
                               21
                               321                                */
	//pattern6();

	//pattern printing 7   
		                  /*   1
                               121
                              12321                                */
	//pattern7();


	/*pattern10();*/



	_getch();
	return 0;
}

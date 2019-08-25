#include<stdio.h>
#include<conio.h>
#include"pattern8.h"
#include"pattern9.h"
#include"pattern10.h"
#include"pattern11.h"
#include"pattern12.h"
#include"factRec.h"
int main()
{
	/*for pattern8        1
		               121
                      12321
                     1234321
					  12321
					   121
					    1*/
	/*pattern8();*/


	/*for pattern9     32123
	                    323
						 3*/

	/*pattern9();*/

	/*for pattern10   0
                     101
                    21012                            */
	//pattern10();

	/*for pattern11 zyxyz
                     zyz
                      z					  */	/*pattern11();*/	//for pattern12 a
//	                ab
//					abc			
	//pattern12();
                    
	//for recursive factorial
	int i,num;
	printf("Enter Number for factorial");
	scanf_s("%d",&num);
	i=facto(num);

	printf("Factorial is %d",i);
	
     
	_getch();
 return 0;
}
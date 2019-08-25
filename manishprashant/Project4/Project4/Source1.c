#include<stdio.h>
int main()
{
	int arr[5],no,i;
	 
	printf("enter the array element");
	scanf("%d %d %d %d %d", arr[5]);
 
	printf("number to be searched");
	scanf("%d", &no);
{
     for(i=0;i<5;i++)

	 {
	 if(arr[i]==no)
		 printf("the number is present");
		 else
			 printf("the number is not present");
	 }

}
return 0;

}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include"retf.h"
void palindrome(char[],int,int);
void replace(char [],char,char);
int main()
{

	//for Sentence palindrome
	/*char i=0,start=0,end=0,bc;
	char str[]="nitin is nitin not malilam";
	char ch1,ch2;
	printf("Enter String:-");
	printf("%s",str);
	printf("\nEnter character to be replace");
	scanf(" %c",&ch1);
	printf("\nEnter character ");
	scanf(" %c",&ch2);*/




	/*scanf("%s",&str);*/

	//for character replacement
	/*replace(str,ch1,ch2);*/

	//for sentence palindrome
	/*end=strlen(str);
	bc=end;
	printf("%d\n",end);
 	while(i<=bc+1)
	{
		if(str[i]==' ' || str[i]=='\0')
		{
			end=i-1;
			palindrome(str,start,end);
			start=i+1;
		}
		i++;
		
	}*/

	int arr[]={721,21,2};
	int i,j,min,temp,x,y;
	/*printf("enter the elemnt in array");
	for(i=0;i<3;i++){

	scanf("%d",&arr[i]);
	}*/

	for(i=0;i<2;i++)
	{    min=i;
		for(j=i+1;j<3;j++)
		{
			x=retf(arr[min]);

			y=retf(arr[j]);
			if(x==j)
			{
				if(arr[min]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
				}
			}
		   else if(x>y)
		   {
				min=j;
			}
		
			if(min!=i)
		   {
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	}
		for(i=0;i<3;i++)
		{
			printf("%d",arr[i]);
		}

    _getch();
	return 0;
}



















//void replace(char str[],char ch1,char ch2)
//{
//	int i;
//	for(i=0;str[i]!='\0';i++)
//	{
//		if(str[i]==ch1)
//		{
//			str[i]=ch2;
//		}
//	}
//printf("%s",str);
//}


//void palindrome(char str[],int st,int en)
//	{
//		int flag=0;
//		int i;
//		int st1=st,en1=en;
//
//
//		while(st<en)
//		{
//			if(str[st]!=str[en])
//			{
//				flag=1;
//				break;
//			}
//			st++;
//			en--;
//		}
//
//		if(flag==0)
//		{
//			for(i=st1;i<=en1;i++)
//			{
//			printf("%c",str[i]);
//			}
//			printf("\n");
//		}
//
//		
//	}
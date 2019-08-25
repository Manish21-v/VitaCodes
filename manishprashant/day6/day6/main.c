#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include"strrev.h"
void strReverse(char*);
int main()
{
	int i,j,n,len=0;
	char ch1[10];
	printf("enter the string");
	scanf("%s",ch1);
	strReverse(ch1);
	
	
	/*for(i=1;ch1[i]!='\0';i++);
	
	printf("%d",i);

	len=i-1;
	
	
	for(j=0;j<i;j++)
	{
		str[len]=ch1[j];
		len--;
	}
	
	str[j]='\0';
	printf("%s",str);*/

	_getch();
	return 0;


}
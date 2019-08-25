#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include"revstring.h"
int main()
{
	char ch[20];
	printf("Enter the string\t");
	/*gets(ch);*/
	scanf("%[^\n]s",ch);
	
	
	revstring(ch);
	_getch();
	return 0;
}
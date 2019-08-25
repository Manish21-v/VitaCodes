#include<stdio.h>
#include<conio.h>
int main()
{
	char ch;
	ch=_getche();
	if(ch>='A'&&ch<='Z')
	{
		ch=ch+32;
		printf("%c",ch);
	}
	else if(ch>='a' && ch<='z')
	{
		ch=ch-32;
		printf("%c",ch);	
	}
	else
		printf("Intput is invalid");
	_getch();
	return 0;

}
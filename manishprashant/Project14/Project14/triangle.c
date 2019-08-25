#include<stdio.h>
#include<conio.h>
int main()
{
	int a=0,b=0,c=0;
	printf("Enter the side of a triangle");
	scanf_s("%d%d%d",&a,&b,&c);
	if((a+b>=c)&&(b+c>=a)&&(a+c)>=b)
	{
		if(((a*a)+(b*b)==(c*c)) ||((b*b)+(c*c)==(a*a))||((a*a)+(c*c)==(b*b)))
		{
			printf("It is Right Angle Triangle");
	    }
		else if((a==b)&&(b==c)&&(c==a))
		{
			printf("Triangle is a Equilateral triangle");
		}
		else if((a==b)||(b==c)||(c==a))
		{
			printf("Triangle is a isosceles triangle");
		}
		else
			printf("It is notspecial triangle");
}
	else{
		printf("Triangle is invalid");
	}
	_getch();
	return 0;
}
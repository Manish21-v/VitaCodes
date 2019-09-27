#include<iostream>
#include<conio.h>
using namespace std;
struct aaa
{
	int num;
};
struct bbb
{
	int num2;
};
struct ccc
{
	int num3;
};

void disp(aaa a )
{
	a.num=10;
	cout<<a.num;
	
}
void disp(bbb a )
{
	a.num2=11;
	cout<<a.num2;
	
}
void disp(ccc a )
{
	a.num3=12;
	cout<<a.num3;
	
}
int main()
{
	aaa a1;
	a1.num=0;
	bbb a2;
	a2.num2=0;
	ccc a3;
	a3.num3=0;
	disp(a1);
	disp(a2);
	disp(a3);
	_getch();

}
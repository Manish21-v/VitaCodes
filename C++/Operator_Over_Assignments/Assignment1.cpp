//1) class Number
//   {
//       int num;
//   }
//In the main function,
//Number n1(8),n2(4),n3(20),n4(6),n5;
//n5=n1-n2*n3/n4;

#include<iostream>
using namespace std;
class Number
{
	
	int num;
public:
	Number()
	{
		num=100;	
	}
	Number(int k)
	{
		num=k;
	}
	~Number()
	{
		cout<<"Inside Destrutor"<<num<<endl;			
	}
	void GetNumber(Number &ref)
	{
		cout<<ref.num;
	}

	Number operator-(Number &ref)
	{
		return Number(num-ref.num);
	}
	Number operator*(Number &ref)
	{
		return Number(num*ref.num);
	}
	Number operator/(Number &ref)
	{
		return Number(num/ref.num);
	}
};


int main()
{
	Number n1(8);
	Number n2(4);
	Number n3(20);
	Number n4(4);

	Number n5=n1-n2*n3/n4;
	cout<<"Answer"<<endl;
	n5.GetNumber(n5);

	
}
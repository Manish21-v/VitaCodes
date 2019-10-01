//3) Given
//
//class Module1
//{
//	int duration;
//	public:
//		Module1(int k)
//		{
//			duration=k;
//		}
//};
//
//class Module2
//{
//	int duration;
//	public:
//		Module2(int k)
//		{
//			duration=k;
//		}
//};		
//	
//write a global function "check" which will take 2 modules (i.e. Module1 and Module2 ) and check whether Modules are same or not.
//call this "check" function from main function.	
//
#include<iostream>
using namespace std;
class Module2;
class Module1
{
	int duration;
	public:
		Module1(int k)
		{
			duration=k;
		}
		friend bool check(Module1 &,Module2&);
};

class Module2
{
	int duration;
	public:
		Module2(int k)
		{
			duration=k;
		}
		friend bool check(Module1 &,Module2&);
};	

bool check(Module1 & re1,Module2& re2)
{

	return (re1.duration==re2.duration);
}
int main()
{
	Module1 m1(5);
	Module2 m2(2);
	if(check(m1,m2))
	{
		cout<<"Modules are equal"<<endl;
	}
	else
	{
		cout<<"Modules are not equal"<<endl;
	}
}

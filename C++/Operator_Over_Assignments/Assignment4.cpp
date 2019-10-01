//4) Define a class , write two member functions 
//	void disp1(){ //some code }
//	void disp2(){ // some code }
//
//	Try to call disp1   from    disp2.

#include<iostream>
using namespace std;
class Myclass
{
public:
	void disp1()
	{
		cout<<"in disp1"<<endl;
	}
	void disp2()
	{
		cout<<"in disp2"<<endl;
		disp1();
	}
};

int main()
{
	Myclass m;
	m.disp2();
}
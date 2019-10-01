//5) Define a class with constructor and  member function
//
//	create object, call member function
//	now create a reference to that object, and using that reference try to call member function
//
#include<iostream>
using namespace std;
class Myclass
{
private:
	char *c;
public:
	Myclass(char *p)
	{
		c=new char((strlen(p)+1));
		strcpy(c,p);
		
	}

	void disp(Myclass &ref)
	{
		cout<<ref.c<<endl;
	}
};

int main()
{
	Myclass m("manish");
	m.disp(m);
	Myclass &m1=m;
	m1.disp(m1);
}
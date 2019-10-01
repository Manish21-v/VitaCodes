//1) class First
//   {
//      char str1[20];
//   };
//   class Second
//   {
//      char str2[20];
//   };
//write a friend function,which will create a  new string containing str1,str2 and also display it.
#include<iostream>
using namespace std;


class Second;
class First
{
public:
	char str1[20];
	
public:
	First()
	{
		cout<<"Inside constructor First"<<endl;
		strcpy_s(str1,"SM VITA");
		
	}
	~First()
	{
		cout<<"inside destructor"<<endl;
	}
	friend void DisplayString(First&,Second &);
};

class Second
{
public:
	char str2[20];
public:
	Second()
	{
		cout<<"Inside constructor second"<<endl;
		strcpy_s(str2,"Start DAC");
	}

	~Second()
	{
		cout<<"inside destructor of Second"<<endl;
	}
	friend void DisplayString(First&,Second &);
};

void DisplayString(First &ref1, Second &ref2)
{
	char ptr[50];
	strcpy(ptr,ref1.str1);
	strcat(ptr,ref2.str2);
	cout<<ptr<<endl;
	cout<<"DONE";
}
int main()
{
	First f;
	Second s;

	DisplayString(f,s);

}


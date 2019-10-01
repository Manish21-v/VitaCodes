//2) 
//class First
//{
//	int a;
//};
//class Second
//{
//	public:
//		void fun1(){}
//		void fun2(){}
//		void fun3(){}
//};
//
//Above code is incomplete.
//Make sure that all the member functions of "Second" will access "a".

#include<iostream>
using namespace std;

class First 
{
private:
	int a;
public:
	First();
	First(int);
	void getnum();
	void setnum(int);
	friend class Second;
};


 First::First()
{
	a=0;
}
 First::First(int k)
 {
	a=k;
 }

 void First::getnum()
 {
	cout<<a<<endl;
 }
 void First::setnum(int k)
 {
	a=k;
 }

 class Second
 {
 public:

	void fun1(First & );
	void fun2(First & );
	void fun3(First & );
 };

 void Second::fun1(First & ref)
 {
	 ref.getnum();
 }

 void Second::fun2(First & ref)
 {
	 ref.getnum();
 }
 void Second::fun3(First & ref)
 {
	 ref.getnum();
 }

 int main()
 {
	First f;
	f.setnum(50);
	First f1(5);
	Second s1;
	s1.fun1(f);
	s1.fun2(f1);
	s1.fun3(f1);
 }
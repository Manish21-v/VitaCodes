void Fibo(int No)
{
int i=0,fib=0;
for(i=1;i<No;i++)
{
	fib=i+fib;
	printf("%d",fib);
}
}
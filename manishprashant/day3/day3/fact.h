int fact(int no)
{
	int result=0,fact=1;
	int s=no;
	while(s>1)
	{
		fact*=s;
		s--;
	}
	return fact;
}
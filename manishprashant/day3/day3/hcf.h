int hcf(int n1,int n2)
{
	int i,hcf,min;
	if(n1>n2)
	{
		min=n2;
	}
	else
	{
		min=n1;
	}
	
	for(i=1;i<=min;i++)
	{
		if((n1%i==0)&&(n2%i==0))
		{
			hcf=i;
		}
	}
	return hcf;
}
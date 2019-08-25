int specialno()
{
	int i,no,sum=0;
	for(i=1;i<=200000;i++)
	{
		no=i,sum=0;
		while(no!=0)
		{
				sum=sum+fact(no%10);
				no=no/10;
		}
		if(sum==i)
			printf("%d\n",i);
		
		
	}
		
}
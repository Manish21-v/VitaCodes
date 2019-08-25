int armstrong()
{
	int i=0,sum,no;
	for(i=100;i<=999;i++)
	{
		no=i,sum=0;
		while(no!=0)
		{
				sum=sum+cube(no%10);
				no=no/10;
		}
		if(sum==i)
			printf("%d\n",i);
		
		
	}
}
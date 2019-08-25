void pattern7()
{
	int i=0,j=0,k=0,s=0,count;
	for(i=1;i<=3;i++)
	{
		count=1;
		for(j=2;j>=i;j--)
		{
			printf(" ");
		}
		for(k=1;k<=i;k++)
		{
			printf("%d",count);
			++count;
		}
		count--;
		for(s=1;s<i;s++)
		{
			
			printf("%d",--count);
		}
		printf("\n");

	}
}
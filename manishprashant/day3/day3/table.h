void table(int no)
{
	int i=0,j;
	for(i=1;i<=no;i++)
	{
		for(j=1;j<=10;j++)
		{
			printf("%dx%d=%d\n",i,j,i*j);
		}
	}
}
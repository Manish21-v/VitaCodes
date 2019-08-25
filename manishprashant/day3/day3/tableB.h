void tableB(int no)
{
	int i=0,j;
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=no;j++)
		{
			printf("%dx%d=%d\t",j,i,i*j);
		}
		printf("\n");
	}
}
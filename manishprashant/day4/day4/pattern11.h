void pattern11()
{
	char i,j,s,k;
for(i=120;i<=122;i++)
{

	for(s=120;s<=i;s++)
	{
	printf(" ");
	}

	for(j=122;j>=i;j--)
	{
	printf("%c",j);
	}
	for(k=122;k>i;k--)
	{
	printf("%c",k);
	}
  printf("\n");
	}
}
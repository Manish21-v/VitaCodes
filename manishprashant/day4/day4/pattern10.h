void pattern10()
{
int i,j,l,k;
for(i=0;i<=2;i++)
{
	for(j=2-i;j>0;j--)
	{
	printf(" ");
	}

for(l=i;l>=0;l--)
{
	printf("%d",l);
}
for(k=l+2;k<=i;k++)
	printf("%d",k);
printf("\n");
}
}
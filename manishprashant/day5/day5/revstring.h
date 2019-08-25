void revstring(char ch[])
{
	int i=0,j,k;
	int mid,end;
	
	char ch1[20];
	while(ch[i]!='\0')
	{
		i++;
	}
	printf("\nsize %d\n",i);
	end=i-1;
	for(k=0;ch[k]!='\0';k++)
	{
		ch1[k]=ch[end];
		end--;
	}
ch1[k]='\0';

	printf("%s",ch);
	printf("\n%s",ch1);
}
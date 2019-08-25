void strReverse(char *ch2)
{
	int i,j,len;
	char str[10];
	printf("%s",ch2);
	for(i=1;ch2[i]!='\0';i++);
	
	printf("%d",i);

	len=i-1;
	
	
	for(j=0;j<i;j++)
	{
		str[len]=ch2[j];
		len--;
	}
	str[j]='\0';
	printf("%s",str);

}
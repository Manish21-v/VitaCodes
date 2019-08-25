void primeN(int no)
{
	int i;
	
	i=no+1;
	while(no>0)
	{
		if(primeno(i))
		{
			printf("%d\n",i);
			no--;
		}
		
		i++;
	}
}
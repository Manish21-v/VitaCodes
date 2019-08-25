int retf(int val)
{
	int ert;
	if(val>0)
	{
		while(val>0)
		{
			ert=val%10;
			val=val/10;
		}
	}
	return ert;
}

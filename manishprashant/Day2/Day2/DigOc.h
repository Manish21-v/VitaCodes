int DigOc(int no,int digit)
{
	int s=no,occ=0,num;
	while(s!=0)
	{
		num=s%10;
		if(num==digit)
		{occ++;}
		s=s/10;
	}
	return occ;
}
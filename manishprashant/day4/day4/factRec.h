int facto(int num)
{
	static int fact=1;
	if(num==2)
		return 2;

	fact=num*facto(num-1);
	return fact;
}
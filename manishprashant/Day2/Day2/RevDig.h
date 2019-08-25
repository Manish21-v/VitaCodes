int RevDig(int no)
{
	int rev=0,i,s=no;
	while(s!=0){
	
			rev=rev*10+(s%10);
			s/=10;

	}
	return rev;
}
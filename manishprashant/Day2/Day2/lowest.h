
int lowestno(){
	int i,sum=0,no,low=0;
	for(i=0;i<10;i++){
	scanf_s("%d",&no);
	
	if(i==0)
	{
		low=no;
	}
	else
	{
		if(no<low)
		{
			low=no;
		}
	}
	}
       	return low;
	

}
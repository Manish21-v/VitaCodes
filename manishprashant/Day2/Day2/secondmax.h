void secondmax(){
	int i,no,max=0,temp=0;
	for(i=0;i<10;i++)
	{
		scanf_s("%d",&no);
		if(no>max)
		{
			temp=max;
			max=no;
		
		}
	}
	printf("Highest no is :%d",max);
	printf("Second Highest no is :%d",temp);
}
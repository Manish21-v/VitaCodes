void countInt(){
	
	int i,no,count1=0,count2=0,count3=0;
	printf("Enter 10 numbers");
	for(i=0;i<10;i++){
		
		scanf_s("%d",&no);
		if(no==0){
		
			count1++;
		}
		else if(no>0){
		
			count2++;
		}
		else if(no<0){
		
			count3++;
		}
	
	}
	printf("number of ZERO no :%d",count1);
	printf("\nnumber of Positive no :%d",count2);
	printf("\nnumber of negative no :%d",count3);



}
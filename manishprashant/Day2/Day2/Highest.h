
int highestno(){
	int i,no,max=0;
	for(i=0;i<10;i++){
	
		scanf_s("%d",&no);
		if(no>max){
			max=no;
		}
	}
	return max;
	
}
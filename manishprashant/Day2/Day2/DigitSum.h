int DigitSum(int val){
	
	int sum=0,i,n=val;
	while(val!=0){
	
			sum+=val%10;
			val=val/10;

	}
	return sum;

}
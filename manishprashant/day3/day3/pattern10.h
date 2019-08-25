void pattern10(){

	int i,j,k,s;
	for(i=1;i<=3;i++){
	
		for(s=2;s>=i;s--)
			printf(" ");

		for(j=1;j<=i;j++)
			printf("%d",i);

		for(k=i-1;k>=1;k--)
			printf("%d",i);

		printf("\n");
	
	}

}
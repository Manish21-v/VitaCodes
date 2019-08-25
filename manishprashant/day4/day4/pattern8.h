void pattern8(){

int i,j,k,s,a,b,c,d,count=1;
	
for(i=1;i<=4;i++){

	for(s=3;s>=i;s--)
		printf(" ");

	for(j=1;j<=i;j++)
		printf("%d",j);

	for(k=i-1;k>=1;k--)
		printf("%d",k);

	printf("\n");

}

for(a=3;a>=1;a--){

	for(b=a;b<=3;b++)
	{
		printf(" ");
	}

	for(d=1;d<=a;d++)
	{
		printf("%d",d);
	}
	for(c=d-2;c>=1;c--)
		printf("%d",c);

	printf("\n");
}
}
void pattern9(){
int i,j,s,k;
for(i=1;i<=3;i++){

	for(s=1;s<=i;s++){
	printf(" ");
}

for(j=3;j>=i;j--){
	printf("%d",j);
}
for(k=j+2;k<=3;k++)
{
	printf("%d",k);
}
printf("\n");
}
}
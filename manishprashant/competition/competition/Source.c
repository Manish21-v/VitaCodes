#include<stdio.h>
int main()
{
	int i,j;
    for(i='A';i<'T';i++)     //for accepting no. of rows
	{
		for(j='A'+1;j<'T';j++)    //for accepting no. of columns
			printf("%c",j);    //this will print required pattern
		printf("\n");       //new line command
	}
	
	getch();
	return 0;
}



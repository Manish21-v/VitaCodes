

int Palendrome (int no)
{
	int r=RevDig(no);
	if(no==r){
		return 1;
	}
	else
		return 0;
}
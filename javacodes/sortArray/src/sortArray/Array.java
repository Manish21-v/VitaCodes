package sortArray;

public class Array {

	public static void main(String[] args) {
		int arr[]={2,5,6,7,1};
		for(int cnt=0;cnt<arr.length;cnt++)
		{
			for(int cnt1=1;cnt1<arr.length-cnt;cnt1++)
			{
				if(arr[cnt1-1]>arr[cnt1])
				{
					int temp=arr[cnt1-1];
					arr[cnt1-1]=arr[cnt1];
					arr[cnt1]=temp;
				}
				 
			}
			
		}
		for(int j=0;j<arr.length;j++)
		{
				System.out.println(arr[j]);
			
		}

	}

}

package javapractice;

public class ArraySortEx {

	public static void main(String[] args) {
		
		int arr[]= {80,4,30,50,20,10};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		}
		
		
		
	}

}

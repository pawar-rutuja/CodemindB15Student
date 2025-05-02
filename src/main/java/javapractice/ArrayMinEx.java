package javapractice;

public class ArrayMinEx {

	public static void main(String[] args) {
	 
		int a[]= {80,37,60,4,30,50,29};
		int min= a[0];
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		 
         System.out.println("Minimum Number is :" + min);
	}

}

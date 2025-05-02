package javapractice;

public class Stringbufferbuilder {

	public static void main(String[] args) {
		
		StringBuffer Sbuf= new StringBuffer("All is Well");
		Sbuf.reverse();
		
		System.out.println(Sbuf);
		
		StringBuilder Sbld= new StringBuilder("All The Best");
		Sbld.reverse();
		
		System.out.println(Sbld);
	}

	
	
}

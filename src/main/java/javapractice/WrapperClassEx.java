package javapractice;

import java.util.Arrays;

public class WrapperClassEx {

	public static void main(String[] args) {

		Integer Array[] = { 20, 70, 50, 10, 30, 40 };
		
		Arrays.sort(Array);
		for (int i = 0; i < Array.length; i++) {

			System.out.println("This is sorted Array :" + i);

		}

	}

}

package collections;

import java.util.ArrayList;

public class Testing {
	public static void main(String[] args) {
		ArrayList<String> internal_mismatch=new ArrayList<String>();
		ArrayList<String> external_mismatch=new ArrayList<String>();
		ArrayList<String> internal_count=new ArrayList<String>();
		ArrayList<String> external_count=new ArrayList<String>();
		//internal mismatch
		internal_mismatch.add("1");
		internal_mismatch.add("2");
		internal_mismatch.add("3");
		internal_mismatch.add("41");
		//external mismatch
	    external_mismatch.add("2");
		external_mismatch.add("4");
		external_mismatch.add("6");
		external_mismatch.add("41");
		//	internal_count
		internal_count.add("5");
		internal_count.add("10");
		internal_count.add("15");
		internal_count.add("20");
		//external_count
		external_count.add("5");
		external_count.add("10");
		external_count.add("15");
		external_count.add("20");
		System.out.println(internal_mismatch.toString());
		System.out.println(external_mismatch.toString());
		System.out.println(internal_count.toString());
		System.out.println(external_count.toString());
		
	}
}

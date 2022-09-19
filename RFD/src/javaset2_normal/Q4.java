package javaset2_normal;

import java.util.ArrayList;
import java.util.HashSet;

public class Q4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("pavan");
		list.add("kalyan");
		list.add("kalyan");
		list.add("manual");
		//System.out.println(list);
		HashSet h1=new HashSet(list);
		System.out.println(h1);
	
	}

}

package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String arg[])
	{
		int[]arr= {3,2,11,4,6,7};

	List<Integer>list=new ArrayList<Integer>();
	list.add(3);
	list.add(2);
	list.add(11);
	list.add(4);
	list.add(6);
	list.add(7);
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Second largest num is"+list.get(4));



}

}

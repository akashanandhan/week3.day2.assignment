package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElementsAnList {

	public static void main(String arg[])
	 {

	 int[] arr = {1,2,3,4,7,6,8};
	 Set<Integer>Numbers=new HashSet<Integer>();
	 for(int i=0;i<arr.length;i++) {
	     Numbers.add(arr[i]);
	 }
	 System.out.println(Numbers);
	 List<Integer>missednum=new ArrayList<Integer>(Numbers);
	 for(int i=1;i<=missednum.size();i++) {
	     if(i!=missednum.get(i-1)) {
	         System.out.println(i);
	         break;
	     }
	 }
	     }
}

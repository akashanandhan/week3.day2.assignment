package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicate {
	  public static void main(String[] args) 
      {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>num=new ArrayList<Integer>();
		 num.add(14);
		 num.add(12);
		 num.add(13);
		 num.add(11);
		 num.add(15);
		 num.add(14);
		 num.add(18);
		 num.add(16);
		 num.add(17);
		 num.add(19);
		 num.add(18);
		 num.add(17);
		 num.add(20);
     Collections.sort(num);
     System.out.println(num);


     Set<Integer> set=new HashSet<Integer>();

    Set<Integer> duplicate=new HashSet<Integer>();

    for (Integer element : num)
    {

   if(!set.add(element))
   {

	   duplicate.add(element);
    }

    }

   System.out.println("Duplicate Elements : "+duplicate);

    }


}

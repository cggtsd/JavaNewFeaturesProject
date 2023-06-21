package cgg.streamoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,1,1);

		Integer reduce = integers.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		System.out.println("-----------------------------");
		
		List<String> names=new ArrayList<String>();
		names.add("abc");
		names.add("lmn");
		names.add("pqr");
		names.add("xyz");
		
		List<String> collect = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
	}

}

package cgg.functionalinterface;

import java.util.HashMap;
import java.util.Map;

import cgg.streamapi.Student;

public class BiConsumerExample {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		//BiConsumer<Integer,String> biConsumer= (k,v)->System.out.println("Key : "+k+"\t Value : "+v);
		
		map.forEach((k,v)->System.out.println("Key : "+k+"\t Value : "+v));

		Map<Integer,Student> stuMap= new HashMap<Integer,Student>();
		stuMap.put(1001, new Student("ABC",30));
		stuMap.put(1002, new Student("XYZ",35));		
		
		System.out.println("-------------------------------");
		stuMap.forEach((k,v)->System.out.println("Key : "+k+"\t Value : "+v));		
				
				
	}

}

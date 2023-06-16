package cgg.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {

	public static void main(String[] args) {
		String [] arr = {"ABC","PQR","XYZ","LMN"};
		
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println);
		
		Stream<String> of = Stream.of("A","B","C","D","E");
		System.out.println("-------------------------");
		of.forEach(System.out::println);
		
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		
		Stream<String> stream2 = list.stream();
        System.out.println("----------------------");
        stream2.forEach(System.out::println);
        
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("PK",23));
        stuList.add(new Student("KK",26));
        stuList.add(new Student("MK",23));
        stuList.add(new Student("SK",21));
        stuList.add(new Student("RK",20));
        stuList.add(new Student("BK",30));
        
        System.out.println("--------------------------");
        Stream<Student> parallelStream = stuList.parallelStream();
        System.out.println("Student data send for processing...");
        parallelStream.forEach(s->doProcess(s));
    	
	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
//massive amount of data for processing :going for parallelStream is a good option
//order of iteration of elements is not maintained
//mkaes use of multithreads as well as multi core processor
}

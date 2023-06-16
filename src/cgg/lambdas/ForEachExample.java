package cgg.lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Raj","Shekhar",20),
				new Person("Farihan","Fatima",20),
				new Person("Dindigala","Sindhu",21),
				new Person("Ganga","Latha",21));
		
		//external iterators controlled by programmers -slow
		System.out.println("Iterating using for loop");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("-----------------------------");
		System.out.println("Iterating using for in loop");
		for (Person person : people) {
			System.out.println(person);
		}
		
		//internal iterators - controlled by JVM possible can execute in parallel also - fast
		System.out.println("----------------------");
		System.out.println("Iterating using lambda");
		people.forEach(p->System.out.println(p));
		
        System.out.println("----------------------------");
		System.out.println("Iterating using method reference");
		people.forEach(System.out::println);
        
      
	}

}

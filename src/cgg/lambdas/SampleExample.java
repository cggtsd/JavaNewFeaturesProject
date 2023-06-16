package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Raj","Shekhar",20),
				new Person("Farihan","Fatima",20),
				new Person("Dindigala","Sindhu",21),
				new Person("Ganga","Latha",21),
				new Person("Rajitha","Korati",20));
		
		
		//step 1:sort list by lastname
		
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		
		//step 2 : create a method that prints all the elemenst in the list
		System.out.println("Printing all persons");
		printConditionally(people,p->true,System.out::println);
		
		//step 3: create a method that prints all persons with last name beginning with 'S'
		System.out.println("-----------------------------------");
		System.out.println("Printing all persons with lastname beginning with 'S' ");
		printConditionally(people,p->p.getLastName().startsWith("S"),System.out::println);
		
		System.out.println("------------------------------------------");
		System.out.println("Printing all persons with first name beginning with 'R");
		printConditionally(people,p->p.getFirstName().startsWith("R"),System.out::println);
	}
	
	/*
	 * private static void printAll(List<Person> persons) { for (Person person :
	 * persons) { System.out.println(person); } }
	 */
		
    private static void printConditionally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer ) {
    	
    	for (Person person : persons) {
		  if(predicate.test(person)) {
			  consumer.accept(person);
		  }
		}
    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



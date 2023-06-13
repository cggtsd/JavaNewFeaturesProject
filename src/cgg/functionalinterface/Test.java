package cgg.functionalinterface;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		//createThreadUsingAnonymousClass();
		//createThreadUsingLambda();
		//createCustomLamda();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Delhi");
		list.add("Hyderabad");
		list.add("Chennai");
		list.add("Banglore");
		
		list.forEach(System.out::println);

	}

	private static void createCustomLamda() {
		
		//defining lambda
		MyInterface i=name->System.out.println("Welcome to "+name);
		
		//invoking lambda
		i.meth1("CGG");
		
	}

	private static void createThreadUsingLambda() {
		//lambda expression
		
		Runnable r =()->System.out.println("My Runnable...");
		
		Thread thread = new Thread(r);
		thread.start();
		
	}

	private static void createThreadUsingAnonymousClass() {
		//anonymous class
		
		
		  Runnable r = new Runnable() {
		  
		  @Override public void run() {
		  System.out.println("Iam thread my task is executing....");
		  
		  }
		  
		  };
		  
		  Thread thread = new Thread(r);
		  
		  thread.start();
		 
		 
	}

}

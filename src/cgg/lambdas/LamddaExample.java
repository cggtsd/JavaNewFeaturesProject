package cgg.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LamddaExample {

	public static void main(String[] args) {
		/*
		 * lambdaWithZeroParam(); System.out.println("------------------------");
		 * anonymousClassZeroParam(); System.out.println("------------------------");
		 * lambdaWithOneParam(); System.out.println("---------------------");
		 * lambdaWithMultipleParam(); System.out.println("------------------------");
		 * lambdaWithParamAndReturnType();
		 * System.out.println("-------------------------"); lambdaToAddNumbers();
		 * System.out.println(); lambdaToLenOfStr();
		 * System.out.println("-------------------------"); lambdaToDouble();
		 * System.out.println("--------------------------"); LambdaToDivide();
		 * System.out.println("--------------------------");
		 * lambdawithInterfaceAsArgument();
		 */
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Farooq","abc@cgg.gov.in",35000.00));
		empList.add(new Employee("Raj Shekar","raj@cgg.gov.in",40000.00));
		empList.add(new Employee("Divya","diuvya@cgg.gov.in",25000.00));
		empList.add(new Employee("Harika","harika@cgg.gov.in",30000.00));
		empList.add(new Employee("Ganga","ganga@cgg.gov.in",45000.00));


		System.out.println("List before sorting");
		for (Employee emp : empList) {
			System.out.println(emp);
		}

        System.out.println("-----------------------");
		Collections.sort(empList, (e1,e2)->e1.getName().compareTo(e2.getName()));
		
		
		Collections.sort(empList,(e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
		
				
		System.out.println("List after sorting");
		for (Employee emp : empList) {
			System.out.println(emp);
		}
		
		
		
	}

	private static void lambdawithInterfaceAsArgument() {
	 //Foo f=()->System.out.println("HELLO ALL......");
	doPerform(()->System.out.println("HELLO ALL......"));
		
	}

	private static void doPerform(Foo f) {
		f.perform();
		
	}

	private static void LambdaToDivide() {
		MyInterface7 i7 = (a,b)->{
			if(b==0) {
				return 0;
			}
			return a/b;
		};
		System.out.println("Division :"+i7.divide(8, 4));
		System.out.println("Division :"+i7.divide(8, 0));
		
	}

	private static void lambdaToDouble() {
		MyInterface6 mi6=n->2*n;
		System.out.println(mi6.doubleMethod(4));
		
	}

	private static void lambdaToLenOfStr() {
		LengthOfString i6=n->n.length();
		System.out.println(i6.len("CGG"));
		
	}

	private static void lambdaToAddNumbers() {
		// TODO Auto-generated method stub
		MyInterface5 i5=(a1,a2)->a1+a2;
		System.out.println("sum of two numbers :"+i5.addMethod(2, 3));
	}

	private static void lambdaWithParamAndReturnType() {
		MyInterface4 i4= (a1,a2)->a1>a2;
		
		System.out.println(i4.test(12,14));
		System.out.println(i4.test(14,12));

		
	}

	private static void lambdaWithMultipleParam() {
		MyInterface3 i3= (n,a)->{
			System.out.println("Your name "+n);
			System.out.println("You are "+a+" years old");
		};
		
		i3.method3("ABC", 20);
	}

	private static void lambdaWithOneParam() {
		MyInterface2 i2= name->System.out.println("Hello "+name);
		
		i2.method2("ABC");
	}

	private static void anonymousClassZeroParam() {
		MyInterface1 i1= new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("Anonymous class...");
				
			}
			
		};
		
		i1.method1();
		
	}

	private static void lambdaWithZeroParam() {
		// defining lambda or implementing interface
		
		MyInterface1 i1=()->System.out.println("Lambda with zero parameetrs...");
		
		//calling lambda
		i1.method1();
	}

}

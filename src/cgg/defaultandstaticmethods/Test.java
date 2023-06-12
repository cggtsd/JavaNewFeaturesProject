package cgg.defaultandstaticmethods;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MyInterface myInterface= new MyClass();
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student("XYZ",20));
        arrayList.add(new Student("PQR",30));
        arrayList.add(new Student("ABC",16));
    
        List<Student> students = myInterface.sortStudents(arrayList);
         for (Student student : students) {
			System.out.println(student.getName()+"\t"+student.getAge());
		}
         
        System.out.println("----------------------------");
        MyInterface.greet("CGG");
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1000);
        intList.add(50);
        intList.add(9000);
        intList.add(90);
        
        System.out.println("----------------------");
        int maxNum = myInterface.getMaxNum(intList);
        System.out.println("Max Num : "+maxNum);
      
	}

}

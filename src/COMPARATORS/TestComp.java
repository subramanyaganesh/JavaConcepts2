package COMPARATORS;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class TestComp {

	public static void main(String[] args) {
		/*Set<Student> al =new TreeSet<>(Student.CASE_INSENSITIVE_ORDER);
		al.add(new Student(1, "a", "21"));
		al.add(new Student(2, "b", "22"));
		al.add(new Student(3, "c", "23"));*/
		Student p=new Student(1, "B", "C");
		Student p1=new Student(1, "c", "c");


		System.out.println(p.name.toLowerCase().compareTo(p1.name.toLowerCase()));

		/*System.out.println(al);
		System.out.println(p);

		System.out.println(al.contains(p));*/


		/*System.out.println("===========================");
		System.out.println("Sorting by Age using comparable");
		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println();
		System.out.println("===========================");
		System.out.println("Sorting by Name using comparator");
		//Using NameComparator to sort the elements
		Collections.sort(al, new NameComparator());
		//Traversing the elements of list
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println();
		System.out.println("===========================");
		System.out.println("sorting by Age using comparator");
		//Using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		//Travering the list again
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}*/


	}

}

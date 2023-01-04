package COMPARATORS;

import java.util.Comparator;
import java.util.Objects;

public class Student {

	int rollno;
	String name;
	String age;

	Student(int rollno, String name, String age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	/*public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}*/

	@Override
	public int hashCode() {
		return Objects.hash(rollno, name, age);
	}

	public static final Comparator<Student> CASE_INSENSITIVE_ORDER = new Student.CaseInsensitiveComparator();

	private static class CaseInsensitiveComparator implements Comparator<Student>, java.io.Serializable {
		// use serialVersionUID from JDK 1.2.2 for interoperability
		private static final long serialVersionUID = 8575799808933029326L;

		public int compare(Student s11, Student s22) {
			String s1 = s11.name;
			String s2 = s22.name;
			String s3 = s11.age;
			String s4 = s22.age;

			return s1.toLowerCase().compareTo(s2.toLowerCase());
		}
	}
}

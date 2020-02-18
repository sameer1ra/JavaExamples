package test;

import java.util.Arrays;
import java.util.List;

public class CompareStringInteger {

	public static void main(String[] args) {
		
		Person p1 = new Person("116", 989200, "Panvel");
		Person p2 = new Person("112", 989200, "Vikhroli");
		Person p3 = new Person("23", 989200, "Panvel");
		Person p4 = new Person("24", 989200, "Panvel");
		Person p5 = new Person(" ", 989200, "Panvel");

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
		//personList.sort((per1,per2) -> new Integer(per1.getName()).compareTo(new Integer(per2.getName())));
		personList.sort((per1,per2) -> per1.getName().compareTo(per2.getName()));
		System.out.println(personList);
	}

}

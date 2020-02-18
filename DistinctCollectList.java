package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctCollectList {

	public static void main(String[] args) {

		Person p1 = new Person("Ram", 989200, "Panvel");
		Person p2 = new Person("Ram", 989200, "Vikhroli");
		Person p3 = new Person("Shyam", 989200, "Panvel");
		Person p4 = new Person("Raju", 989200, "Panvel");
		Person p5 = new Person("Vicky", 989200, "Panvel");

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
		System.out.println("personList ==>" + personList);
		List<Person> distinctPersonList = personList
											.stream()
											.filter(distinctByKey(person -> person.getName()))
											.collect(Collectors.toList());
		System.out.println("distinctPersonList ==>" + distinctPersonList);

	}


	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		   
		    Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
		    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null; 
		}

}

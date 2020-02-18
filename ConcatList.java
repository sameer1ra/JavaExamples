package test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ConcatList
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		List<String> al = new ArrayList();
		al.add("Ram");
		al.add("sumit");
		al.add("jose");
		
		List<String> al_1 = new ArrayList();
		al_1.add("shyam");
		al_1.add("virat");
		
		
		System.out.println(al);
		System.out.println(al_1);
		Collections.copy(al, al_1);
		System.out.println(al);
		
		//List<String> al_2	=	Stream.concat(al.stream(), al_1.stream())
          //      .collect(Collectors.toList());
                
        //System.out.println(al_2);
		
	}
}
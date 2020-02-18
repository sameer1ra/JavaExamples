package test;

import java.util.*;
import java.util.stream.Collectors;

public class DebugLamda {

	public static void main(String[] args) {
		List<Integer> naturals = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		naturals.stream()
		    .map(n -> n * 2)
		    .peek(System.out::println)
		    .collect(Collectors.toList());
		
		naturals.forEach(
				inte -> {
					System.out.println(inte);	
				});
	}

}

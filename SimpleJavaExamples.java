package test;

public class SimpleJavaExamples {

	public static void main(String[] args) {
		
		String VALID_OPERATIONS = "create|update|delete";
		
		if("Update".toLowerCase().matches(VALID_OPERATIONS))
			System.out.println("String OR condition matches");
		else
			System.out.println("matches is not working");			

	}

}

package test;

import java.util.*;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelStream {

	public static void main(String[] args){

		List<String> al = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven","twelve");
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		HelperClass hc = new HelperClass();

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task 1 ");
				al.parallelStream().forEach(item -> {
					try {
						hc.updateES(item);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				});
		    }
		});

		



		List<String> al_num = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");


        System.out.println("Asynchronous task 2 ");
        al_num.parallelStream().forEach(item -> {
			try {
				hc.sendmessage(item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
    
//		executorService.execute(new Runnable() {
//		    public void run() {
//		        System.out.println("Asynchronous task 2 ");
//		        al_num.parallelStream().forEach(item -> {
//					try {
//						hc.sendmessage(item);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				});
//		    }
//		});

		
		
		executorService.shutdown();

	}

}

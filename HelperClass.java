package test;

public class HelperClass {

	public void updateES(String string) throws InterruptedException {
		
		//if(string.equals("eight")) {
			Thread.sleep(30000);
		//}
		System.out.println(java.time.LocalTime.now() +" updateES ==> "+string +"Thread name ==>"+Thread.currentThread().getName());
		
	}

	public void sendmessage(String string) throws InterruptedException{
		
		Thread.sleep(10000);
		System.out.println(java.time.LocalTime.now() +" sendmessage ==> "+string+"Thread name ==>"+Thread.currentThread().getName());
	}

}

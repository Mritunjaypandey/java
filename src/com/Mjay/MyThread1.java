package com.Mjay;

class MyThread implements Runnable{
	public void run() {
		System.out.println("hello pandey");
	}
}
	public class MyThread1{
	public static void main(String [] args) {
		
		MyThread t2= new MyThread();
		Thread t1= new Thread(t2);
		t1.start();
	}
}


/*class MyThread1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  MyThread1 t1=new MyThread1();  
	  MyThread1 t2=new MyThread1();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}
	*/


 
import java.util.Scanner;
public class ArrayCode1 {
	public static void main(String[] args) {
		System.out.println("-----------Static Approach-------------");
		//single-dimensional array using static approach
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of array a: "+a[i]);
		}
		System.out.println("-----------Dynamic Approach-------------");
		//single-dimensional array using dynamic approach
		System.out.println("ENter the array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a1[] = new int[size];
		
		for(int i=0;i<a1.length;i++) {
			System.out.println("Enter the element no:"+(i+1));
			a1[i]=sc.nextInt();
		}
		//Displaying the array elements 
		for(int i=0;i<a1.length;i++) {
			System.out.println("the element no:"+(i+1)+" is: "+a1[i]);
		}
		sc.close();
	}
}


Scanner sc = new Scanner(System.in);
		int [][] a1 = new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("Enter the element no:"+(j+1));
				a1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("the element no:"+(j+1)+" is: "+a1[i][j]);
			}
		}


//Thread is a built in class in java present in java.lang package
public class ThreadBasic {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t);
		t.setName("Shaktiman");
		t.setPriority(1);
		System.out.println(t);
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getClass());
	}
}
// Thread[Thread-0,5,main]
// Thread-0 (name of the thread)
// 5 (priority of the thread)
// main (method associated to the thread)


class Operations extends Thread
{
	public void run() {
		if(Thread.currentThread().getName().equals("Addition")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("Subtraction")) {
			sub();
		}
		else if(Thread.currentThread().getName().equals("Multiplication")) {
			mul();
		}
		else {
			div();
		}
	}
	void add() {
		System.out.println("Addition is executed");
	}
	void sub() {
		System.out.println("Subtraction is executed");
	}
	void mul() {
		System.out.println("Multiplication is executed");
	}
	void div() {
		System.out.println("Division is executed");
	}
}
public class ThreadingCode1 {
	public static void main(String[] args) {
		Operations op1 = new Operations();//thread-1
		Operations op2 = new Operations();//thread-2
		Operations op3 = new Operations();//thread-3
		Operations op4 = new Operations();//thread-4
		
		op1.setName("Addition");
		op2.setName("Subtraction");
		op3.setName("Multiplication");
		op4.setName("Division


op4.setName("Division");
		
		op1.start();//op1 is given to the scheduler
		op2.start();//op2 is given to the scheduler
		op3.start();//op3 is given to the scheduler
		op4.start();//op4 is given to the scheduler
		
		
	}
}



public class ThreadingCode2 {
	public static void main(String[] args) {
		Operations1 op1 = new Operations1();//not a thread
		Operations1 op2 = new Operations1();//not a thread
		Operations1 op3 = new Operations1();//not a thread
		Operations1 op4 = new Operations1();//not a thread
		
		Thread t1 = new Thread(op1);
		Thread t2 = new Thread(op2);
		Thread t3 = new Thread(op3);
		Thread t4 = new Thread(op4);
		
		t1.setName("Addition");
		t2.setName("Subtraction");
		t3.setName("Multiplication");
		t4.setName("Division");
		
		t1.start();//t1 is given to the scheduler
		t2.start();//t2 is given to the scheduler
		t3.start();//t3 is given to the scheduler
		t4.start();//t4 is given to the scheduler
		
		
	}
}


public class ThreadingCode2 {
	public static void main(String[] args) {
		Operations1 op1 = new Operations1();//not a thread
		Operations1 op2 = new Operations1();//not a thread
		Operations1 op3 = new Operations1();//not a thread
		Operations1 op4 = new Operations1();//not a thread
		
		Thread t1 = new Thread(op1);
		Thread t2 = new Thread(op2);
		Thread t3 = new Thread(op3);
		Thread t4 = new Thread(op4);
		
		t1.setName("Addition");
		t2.setName("Subtraction");
		t3.setName("Multiplication");
		t4.setName("Division");
		
		t1.start();//t1 is given to the scheduler
		t2.start();//t2 is given to the scheduler
		t3.start();//t3 is given to the scheduler
		t4.start();//t4 is given to the scheduler
		
		
	}
}


public class AccessSpecifiers1 {
	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj1 = new defAccessSpecifier(); //object for default access specifier		  
        obj1.display(); 
        
        System.out.println("private Access Specifier");
		defPAccessSpecifier obj2 = new defPAccessSpecifier(); //object for private access specifier 		  
       obj2.display(); 
        
        System.out.println("prtected Access Specifier");
        defprotAccessSpecifier obj3 = new defprotAccessSpecifier(); //object for protected access specifier
        obj3.display();
	}
}



class defAccessSpecifier
{ 
  void display() //default : available only within same package
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
class defPAccessSpecifier
{ 
  private void display() //private : only within the class
     { 
         System.out.println("You are using private access specifier"); 
     } 
} 
class defprotAccessSpecifier
{ 
  protected void display() //protected : available within same package and also inheritance class
     { 
         System.out.println("You are using prtected  access specifier"); 
     } 
} 




import java.util.Scanner;
class Calculator{
	void operations() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num-1");
		int num1 = sc.nextInt();
		System.out.println("enter the num-1");
		int num2 = sc.nextInt();
		
		System.out.println("Please select the opearation to be performed\n "
				+ "1. Addition\n"
				+ "2. subtraction\n"
				+ "3. multiplication\n"
				+ "4. division\n"
				+ "5. exit");
		int n = sc.nextInt();
		
		if(n==1) {
			int addition = num1+num2;
			System.out.println("The addition result is: "+addition);
		}
		else if(n==2) {
			int subtraction = num1-num2;
			System.out.println("The subtraction result is: "+subtraction);
		}
		else {
			System.exit(0);
		}
	}
}
public class Code1 {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		for(; ;) //infinite loop
		{
			c.operations();
		}
		
	}
}



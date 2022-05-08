import java.util.*;
public class mapDemo {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		hm.put((-1),"Tim");    
		hm.put(2,"Mary");    
		hm.put(3,"Catie");   
		System.out.println("\nThe elements of Hashmap are ");  
		/*
		 * for(Object x : arr)
		 * 
		 * 
		 */
		
		
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		ht.put(4,"Ales");  
		ht.put(5,"Rosy");  
		ht.put(6,"Jack");  
		ht.put(7,"John");  
		System.out.println("\nThe elements of HashTable are ");  
		for(Map.Entry n:ht.entrySet()){    
			System.out.println(n.getKey()+" "+n.getValue());    
		}
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(9,"Carlotte"); 
		map.put(10,"Catie"); 
		map.put(8,"Annie");    
		   
		      

public class innerClassAssisted1 {
	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
	  }  
	 }  
	public static void main(String[] args) {
		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class innerClassAssisted2 {
	private String msg="Inner Classes";//8
	void display(){  //3
		class Inner{  
			void msg(){//6
				System.out.println(msg);//7
			}  
		}  
		Inner l=new Inner(); //4 
		l.msg(); //5 
	}  
	public static void main(String[] args) {
		innerClassAssisted2  ob=new innerClassAssisted2 ();  //1
		ob.display();  //2
	}
}


//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}
	public class innerClassAssisted3 {
	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {
		
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("Inside anonymous inner class method");
		}
	};
	      i.display();
	   }
	}

public class stringDemo {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		//length
		String sl=new String("Hello World");
		System.out.println(sl.length());
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));
		//String Comparison
		String s1="Hello";//ascii of l to be collected 
		String s2="Heldo";//ascii of d to be collected
		//value of d will be subtracted from l
		System.out.println(s1.compareTo(s2));//subtracted value
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());


//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);//Welcome to Java! Enjoy your learning
		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.app


//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);
		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);//Welcome to Java! Enjoy your learning
		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.app

//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}


public class innerClassAssisted1 {
	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
	  }  
	 }  
	public static void main(String[] args) {
		innerClassAssisted1 obj=new innerClassAssisted1();
		innerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}


public class innerClassAssisted2 {
	private String msg="Inner Classes";//8
	void display(){  //3
		class Inner{  
			void msg(){//6
				System.out.println(msg);//7
			}  
		}  
		Inner l=new Inner(); //4 
		l.msg(); //5 
	}  
	public static void main(String[] args) {
		innerClassAssisted2  ob=new innerClassAssisted2 ();  //1
		ob.display();  //2
	}
}

//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}
	public class innerClassAssisted3 {
	public static void main(String[] args) {
	AnonymousInnerClass i = new AnonymousInnerClass() {
		
		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("Inside anonymous inner class method");
		}
	};
	      i.display();
	   }
	}


import java.util.*;
public class mapDemo {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		hm.put((-1),"Tim");    
		hm.put(2,"Mary");    
		hm.put(3,"Catie");   
		System.out.println("\nThe elements of Hashmap are ");  
		/*
		 * for(Object x : arr)
		 * 
		 * 
		 */
		
		
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}
		//HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		ht.put(4,"Ales");  
		ht.put(5,"Rosy");  
		ht.put(6,"Jack");  
		ht.put(7,"John");  
		System.out.println("\nThe elements of HashTable are ");  
		for(Map.Entry n:ht.entrySet()){    
			System.out.println(n.getKey()+" "+n.getValue());    
		}
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(9,"Carlotte"); 
		map.put(10,"Catie"); 
		map.put(8,"Annie");    
		   
		      

//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}


1. Complete all the self learning videos
2. Go through all the built in methods inside the collections
3. Go through all the built in methods inside the String class
4. Go through all the built in methods inside the StringBuffer class
5. Go through all the built in methods inside the StringBuilder class


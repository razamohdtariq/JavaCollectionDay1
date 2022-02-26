//Linked List

import java.util.*;
public class TestJavaCollection2 {
  
	public static void main(String args[]){  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("Tariq");  
	al.add("Akram");  
	al.add("Jitu");  
	al.add("Akhtar");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


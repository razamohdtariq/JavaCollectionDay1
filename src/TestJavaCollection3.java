//Vector

import java.util.*;
public class TestJavaCollection3 {
	 
	public static void main(String args[]){  
	Vector<String> v=new Vector<String>();  
	v.add("Tariq");  
	v.add("Amit");  
	v.add("Ayush");  
	v.add("Abhishek");  
	Iterator<String> itr=v.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


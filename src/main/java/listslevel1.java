package lists_1;

import java.util.*;
	
public class listsLevel1 {
	public static Scanner reader = new Scanner (System.in);
	
	public static Node exe1 (int [] arr)
	{
		Node <Integer> a1 = new Node <>(arr[0]);
		Node <Integer> a2 = a1;
		Node <Integer> a3 = new Node <>(arr[1]);
		
		for (int i = 1 ; i < arr.length ; i++ )
		{
			a3 = new Node <Integer> (arr[i]);
			a2.setNext(a3);
			a2= a3;
		}
		return a1;
	}
	
	public static void exe2_list (Node <Integer> header)
	{
		Node <Integer> current = header;
		
		while (current != null)
		{
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}
	
	public static void exe2_recursion(Node <Integer> header) 
	{
		if (header != null)
		{
			System.out.println(header.getValue());
			exe2_recursion(header.getNext());
		}
		
	}
	
	public static void exe2_recursion_reverse(Node <Integer> header) 
	{
		if (header != null)
		{
			exe2_recursion_reverse(header.getNext());
			System.out.println(header.getValue());
		}
		
	}
	
	public static Node<Integer> exe3()
	{
		System.out.println("Enter a positive number: ");
		int num = reader.nextInt();
		
		Node <Integer> header = new Node <> (null);
		Node <Integer> current = header;
		Node <Integer> x;
		
		while (num != -1)
		{
			
			x = new Node <Integer> (num);
			current.setNext(x);
			current = x;
			
			System.out.println("Enter a positive number: ");
			num = reader.nextInt();
		}
		
		return header.getNext();
	}
	
	public static void exe4 (Node <Integer> header)
	{
		Node <Integer> current = header;
		
		while (current != null)
		{
			if (current.getValue() % 2 == 0)
			{
				System.out.println(current.getValue());
			}
			current = current.getNext();
		}
		
	}
	
	public static boolean exe5 (Node <Integer> header, int n)
	{
		
		
		while (header != null)
		{
			if (header.getValue() == n )
			{
				return true;
			}
			header = header.getNext();
		}
		return false;
	}
	
	public static boolean exe5_TailRecursion(Node <Integer> header, int n)
	{
		if (header == null)
		{
			return false;
		}
		if (header.getValue() == n)
		{
			return true;
		}
		
		return exe5_TailRecursion(header.getNext(), n);
		
	}

	public static Node<Integer> exe6(Node<Integer> a1, int x)
	{
		Node<Integer> a2 = a1;
		Node<Integer> a3 = a2.getNext();
		        	 
		while (a3.getValue() != null)
			{
				if(a3.getValue().equals(x))
				{
		        		a2.setNext(a3.getNext());
		        		return a1;
		        	}
		        	else
				{
		        		a2.setNext(a3); 
		     	              	a2=a3;
		        	        a3=a3.getNext();
		        	}
		        }
		        	   
		return a1;
	} 
		        
		        
		        
	public static Node<Integer> exe7(Node<Integer> a1, int x)
	{
		Node<Integer> a2 = a1;
		Node<Integer> a3=a2.getNext();
		int i=1;
		if(x==1)
		{
		     return a3;
		}
		while (a3.getValue() != null)
			{
		     	      if(i==x-1)
			      {
				      a2.setNext(a3.getNext());
				      return a1;
			      }
		     	      else
			      {
				      a2.setNext(a3); 
			              a2=a3;
		   	              a3=a3.getNext();
		     	      }
		     	      i++;
		     	}
		     	return a1;
	}
		        	

	public static boolean exe8(Node<Integer> a1, Node<Integer> b1,Node<Integer> c1)
	{
		if(a1==null)
		{
			return true;
		}
		
		if(b1==null) 
		{
		        return false;
		}
		          
		if(!b1.getValue().equals(a1.getValue())) 
		{
		      	return q8(a1,b1.getNext(),c1);
		}
		      	
		return q8(a1.getNext(),c1,c1);
		    	   
	}
		        
		        
		        
	public static void exe9(Node<Integer> a1, Node<Integer> b1)
	{
		Node<Integer> b2 = b1;
		while(a1 != null) 
		{
		        if(b2.getValue().equals(a1.getValue())) 
			{
		        	System.out.println(a1.getValue());
		        	b2=b2.getNext();
		        }
		        else 
			{
		        	b2=b2.getNext();
		        }
		        		
			if(b2==null) 
			{
		              	b2=b1;
		              	a1=a1.getNext();
		        }
		}
		        	
	}
		        
	public static Node<Integer> exe10(Node<Integer> a1, Node<Integer> b1)
	{
		Node<Integer> b2 = b1;
		        	
		while(a1 != null) 
		{
		        if(b2.getValue().equals(a1.getValue())) 
			{
		        	b2=b2.getNext();
		        }
				
		        else 
			{
		        	b2=b2.getNext();
		        }
			
		        if(b2==null) 
			{
		              	b2=b1;
		              	a1=a1.getNext();
		        }
		}
		        	return c1;
		        	
	}
		         	
		        
		        
	public static Node<Integer> exe11(Node<Integer> a1, Node<Integer> b1)
	{
		Node<Integer> b2 = b1;
		Node<Integer> a2 = a1;
		Node<Integer> a3=a2.getNext();
		while(a3 != null) 
		{
		        if(b2.getValue().equals(a3.getValue())) 
			{
		        	a2.setNext(a3.getNext());
		        	a2=a3.getNext();
		        	a3=a3.getNext().getNext();
		        	b2=b2.getNext();
		        }
		        
			else 
			{
		        	a2=a3;
		        	a3=a3.getNext();
		        	b2=b2.getNext();
		        }
		        		
			if(b2==null) 
			{
		              	b2=b1;
		              	a2=a2.getNext();
		              	  
			}
		        	
		}
		        	
		return a1;
		        	
		         
	}
	public static void main(String[] args) {

		
		int [] arr = {1,2,3,4,5};
		Node <Integer> lst = exe1(arr);
		System.out.println(lst);
		System.out.println("---- print list ----------------------------");
		exe2_list(lst);
		System.out.println("---- print list : Recursion ----------------");
		exe2_recursion(lst);
		System.out.println("---- print list : Reversed Recursion  ------");
		exe2_recursion_reverse(lst);
		System.out.println("Exercise 3: " + exe3());
		System.out.println("---- print even ----------------------------");
		exe4(lst);
		System.out.println("Exercise 5: " + exe5(lst, 7));
		System.out.println("Exercise 5 - Tail recursion: " + exe5_TailRecursion(lst,8));
		
		
	}

}

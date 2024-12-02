public class hw_Lists {

	public static Node exe1 (int x, int y, int n)
	{
		Node <Integer> first = new Node <> ((int)(Math.random()*(y - x + 1 )) + x);
		Node <Integer> current = first;
		Node <Integer> next ;
		
		for (int i = 1 ; i < n ; i++)
		{
			next = new Node <> ((int)(Math.random()*(y - x + 1 )) + x);
			current.setNext(next);
			current = next ;
		}
		
		return first;
		
	}
	
	public static int exe2 (int x, Node <Integer>  h)
	{
		int count = 0;
		Node <Integer> current = h ;
		
		while (current != null)
		{
			if (current.getValue() == x)
			{
				count ++ ;
			}
			current = current.getNext();
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Node <Integer> exe1_list = exe1(3, 4, 5);
		System.out.println(exe1_list);
		System.out.print(exe2(4, exe1_list));

	}

}

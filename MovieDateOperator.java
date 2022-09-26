class MovieDateOperator{
	static String[] movie={null,null,null,null,null};
	static int position=0;
	
	static void save(String value)
	{
		System.out.println("Enter to main method");
		
		movie[position]=value;
		position++;
		
		
		
		for(int index=0;index<=movie.length;index++)
		{
		
			System.out.println(index);
		System.out.println("position="+movie[position]);
		}
		
		System.out.println("exit"); 
		
	}
	
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0;index<=movie.length;index++)
		{
			System.out.println("elements="+movie[index]);
		}
	}
	
}
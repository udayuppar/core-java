class TempleDataOperator{
	
	static String[] temple={null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		System.out.println("nadita ede");
		
		temple[position]=name;
		
		System.out.println("position"+position+ "is"+temple[position]);
		position++;
		
		System.out.println("mugitu"); 
		
	}
	
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0;index<=temple.length;index++)
		{
			System.out.println("elements="+temple[index]);
		}
	}
}
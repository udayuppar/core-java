class PoliticalDateOperator{
	static String[] politicalDate={null,null,null,null,null};
	static int position=0;
	
	static void save(String value)
	{
		System.out.println("Enter to main method");
		
		politicalDate[position]=value;
		position++;
		
		
		
		for(int index=0;index<=politicalDate.length;index++)
		{
		
			System.out.println(index);
		System.out.println("position="+politicalDate[position]);
		}
		
		System.out.println("exit"); 
		
	}
	
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0;index<=politicalDate.length;index++)
		{
			System.out.println("elements="+politicalDate[index]);
		}
	}
	
}
class GraduateDateOperator{
	static String[] graduateDate={null,null,null,null,null};
	static int position=0;
	
	static void save(String value)
	{
		System.out.println("Enter to main method");
		
		graduateDate[position]=value;
		position++;
		
		
		
		for(int index=0;index<=graduateDate.length;index++)
		{
		
			System.out.println(index);
		System.out.println("position="+graduateDate[position]);
		}
		
		System.out.println("exit"); 
		
	}
	
	static void displayDetails()
	{
		System.out.println("displayDetails");
		for(int index=0;index<=graduateDate.length;index++)
		{
			System.out.println("elements="+graduateDate[index]);
		}
	}
}
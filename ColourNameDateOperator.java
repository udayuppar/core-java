class ColourNameDateOperator{
	static String[] colourNameDate={null,null,null,null,null,null};
	static int position=0;
	
	static void save(String name)
	{
		if(position>6)
		{
			System.out.println("colour is exedede");
			return;
		}
		
		if(name!=null && name.length()>3)
		{
			System.out.println("save the date");
			colourNameDate[position]=name;
			System.out.println("position:"+colourNameDate[position]+"is:"+position);
			position++;
			System.out.println("print  the date");
			
		}
		else{
			System.out.println(" do not print  the date");
		}
	}
	
	static void displayAllColour()
	{
		System.out.println("lets start");
		for(int find=0; find<colourNameDate.length; find++)
		{
			System.out.println("position="+colourNameDate[find]);
		}
	}
	
	static boolean findColour(String colour)
	{
		for(int index=0; index<colourNameDate.length;index++)
		{
			if(colourNameDate[index]==colour)
			return true;
			
		}
		return false;
	}
}
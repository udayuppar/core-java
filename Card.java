class Card{
	
	 static String type;
	 static int height;
	 static int width;
	 static double price;
	 static String colour[];
	 
	 static void printDetails()
	 {
		System.out.println(type); 
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(colour!=null)
		{
			System.out.println("Array is pointing to memory");
			for(int index=0;index<=colour.length-1;index++)
			{
				String ref=colour[index];
				System.out.println(ref +"colour"+colour[index]);
			}
		} else
		{
			System.out.println("Array is not pointing to memory");
		}
	 }
	
}
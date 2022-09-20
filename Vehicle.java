class Vehicle{
	static double transport(String source,String destination)
	{
		System.out.println("Enterd source:"+source);
		System.out.println("place:"+destination);
		return 100;
	}	
	static double transport(String source,String destination,boolean ontime)
	{
		System.out.println("Enterd source:"+source);
		System.out.println("place:"+destination);
		System.out.println("ontime:"+ontime);
		return 100;
	}
	static boolean transport(String destination)
	{
	    System.out.println("place:"+destination);
			return true;
	}
	static boolean transport(String destination,boolean ontime)
	{
		System.out.println("place:"+destination);
		System.out.println("ontime:"+ontime);
		return true;
	}
}
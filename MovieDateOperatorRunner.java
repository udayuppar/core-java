class MovieDateOperatorRunner{
	public static void main(String[] as)
	{
		System.out.println("Enter main method");
		
		String ref="seetheRaman";
		MovieDateOperator.save(ref);
		MovieDateOperator.save("KGF");
		MovieDateOperator.save("kranti");
		MovieDateOperator.save("vikranthRoona");
		MovieDateOperator.save("vikram");
		MovieDateOperator.displayDetails();
		
		System.out.println("the end");
		
	}
}
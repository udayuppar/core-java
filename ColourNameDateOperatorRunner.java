class ColourNameDateOperatorRunner{
	public static void main(String[] red)
	{
		System.out.println("***********Enter the main method***************");
		
		ColourNameDateOperator.save("orange");
		ColourNameDateOperator.save("yellow");
		ColourNameDateOperator.save("block");
		ColourNameDateOperator.save("pink");
		ColourNameDateOperator.save("blue");
		ColourNameDateOperator.save("skyBlue");
		
		
		ColourNameDateOperator.displayAllColour();
		
		boolean ref=ColourNameDateOperator.findColour("green");
		
		
		System.out.println("************End main method***************");
		
		
	}
}
class CardRunner{
	public static void main(String[] ATM)
	{
		System.out.println("Enter card details");
		
		Card.printDetails();
		
		Card.type="ATM";
		Card.height=2;
		Card.width=1;
		Card.price=25000;
		
		String[] details={"red","blue","orenge","block"};
		Card.colour=details;
		Card.printDetails();
		
		System.out.println("card details");
		
	}
}
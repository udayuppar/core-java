class Product{
	public static void main(String[] data)
	{
		System.out.println("main start");
		
		String name=data[0];
		System.out.println("product name="+ name);
		
		String type=data[1];
		System.out.println("product type="+ type);
		
		String price=data[2];
		System.out.println("product price="+ price);
		
		String quantity=data[3];
		System.out.println("product quantity="+ quantity);
		
		String quality=data[4];
		System.out.println("product quality="+ quality);
		
		int convertedPrice=Integer.parseInt(price);
		System.out.println("convertedPrice="+convertedPrice);
		
		int convertedQuantity=Integer.parseInt(quantity);
		System.out.println("convertedQuantity="+convertedQuantity);
		
		int totalPrice=convertedPrice*convertedQuantity;
		System.out.println("totalPrice="+totalPrice);
	}
}
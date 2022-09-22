class ToothPasteRunner{
	public static void main(String[] bresh)
	{
		
		ToothPaste.printDetailse();
		System.out.println("***********************************");
		
		ToothPaste.setCompanyName("Colgate");
		ToothPaste.setColour("red");
		ToothPaste.setProduct("oralHygiene");
		ToothPaste.setWeightInGrams(500);
		ToothPaste.setCleanTheTeeth(true);
		ToothPaste.setFlavours("salt");
		ToothPaste.setManufacteringDate(2022);
		ToothPaste.setExpireDate(2023);
		ToothPaste.setPrice(250);
		ToothPaste.setSize('M');
		ToothPaste.setProperties("water");
		ToothPaste.setMainIngredients("hydrogenPeroxide");
		ToothPaste.setLogo("ColgateLogo");
		ToothPaste.setPurpuse("removeFoodDebris");
		ToothPaste.setUsage("cleanTheTeeth");
		
		ToothPaste.printDetailse();
		System.out.println("***********************************");
		
		
	
		System.out.println("***********************************");
			String ref1=ToothPaste.companyName;
			System.out.println("companyName="+ref1);
			
			String ref2=ToothPaste.colour;
			System.out.println("colour="+ref2);
			
			String ref3=ToothPaste.product;
			System.out.println("product="+ref3);
			
			int ref4=ToothPaste.weightInGrams;
			System.out.println("weightInGrams="+ref4);
			
			boolean ref5=ToothPaste.cleanTheTeeth;
			System.out.println("cleanTheTeeth="+ref5);
			
			String ref6=ToothPaste.flavours;
			System.out.println("flavours="+ref6);
			
			int ref7=ToothPaste.manufacteringDate;
			System.out.println("manufacteringDate="+ref7);
			
			int ref8=ToothPaste.expireDate;
			System.out.println("expireDate="+ref8);
			
			int ref9=ToothPaste.price;
			System.out.println("price="+ref9);
			
			char ref10=ToothPaste.size;
			System.out.println("size="+ref10);
			
			String ref11=ToothPaste.properties;
			System.out.println("properties="+ref11);
			
			String ref12=ToothPaste.mainIngredients;
			System.out.println("mainIngredients="+ref12);
			
			String ref13=ToothPaste.logo;
			System.out.println("logo="+ref13);
			
			String ref14=ToothPaste.purpuse;
			System.out.println("purpuse="+ref14);
			
			String ref15=ToothPaste.usage;
			System.out.println("usage="+ref15);
			
			
		 
	}
}
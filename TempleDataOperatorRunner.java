class TempleDataOperatorRunner{

		public static void main(String[] om)
		{
			System.out.println("Enter main method");
			
			String ref="rama";
			TempleDataOperator.save(ref);
			TempleDataOperator.save("seetha");
			TempleDataOperator.save("hanuman"); 
			TempleDataOperator.save("lordShiva");
			TempleDataOperator.save("bheema");
			TempleDataOperator.displayDetails();
			System.out.println("main end");
		}
}
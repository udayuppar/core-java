class MixieRunner{
	public static void main(String[] as)
	{
		System.out.println("properties of Mixie");
		
		String brand=Mixie.brand;
		String colour=Mixie.colour;
		String model=Mixie.model;
		int size=Mixie.size;
		int blades=Mixie.blades;
		int controler=Mixie.controler;
		boolean mixie=Mixie.mixie;
		boolean swtiches=Mixie.swtiches;
		
		System.out.println("brand name:"+brand);
		System.out.println("colour of the mixie:"+colour);
		System.out.println("model number:"+model);
		System.out.println("mixie size:"+size);
		System.out.println("number of blades:"+blades);
		System.out.println("controler name:"+controler);
		System.out.println("true mixie:"+mixie);
		System.out.println("true swtiches:"+swtiches);
	}
}
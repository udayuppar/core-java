class WashingMachineRunner{
	public static void main(String[] as)
	{
		System.out.println("details of WashingMachine");
		
		String name=WashingMachine.name; 
		String colour=WashingMachine.colour;
		String power=WashingMachine.power;
		int version=WashingMachine.version;
		int size=WashingMachine.size;
		String material=WashingMachine.material;
		boolean washing=WashingMachine.washing;
		
		System.out.println("Name of the washingmachine:"+name);
		System.out.println("colourof the washingmachine:"+colour);
		System.out.println("power consuming:"+power);
		System.out.println("no of version:"+version);
		System.out.println("size of the washingmachine:"+size);
		System.out.println("material used:"+material);
		System.out.println("washing cloth:"+washing);
	}
}
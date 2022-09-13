class TrimmerRunner{
	public static void main(String[] hair)
	{
		System.out.println(Trimmer.colour);
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
		System.out.println(Trimmer.totalSettings);
		
		for(int index=0; index<Trimmer.totalSettings.length; index++)
		{
			String ref=Trimmer.totalSettings[index];
			System.out.println("size:"+ref);
		}
	}
}
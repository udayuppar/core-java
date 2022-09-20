class Hospital{
	
	static String HospitalName;
	static String DeanName;
	static String Adrres;
	static int buildings;
	static String medicalName;
	static int NumOfAmbulence;
	static double DocterSalary;
	static int consultencyFree;
	static int NumOfDepartments;
	static long HospitalNumber;
	static int labs;
	static boolean patientsQuer;
	static int NumOfDocter;
	static int NumOfSisters;
	static int NumOfMaleWards;
	static int NumOfFemaleWards;
	static int OperationRoom;
	static  String[] Departments;
	static int[] Departments1;
	static double[] Departments2;
	static long[] Departments3;
	
	static void printDetailse()
	{
		System.out.println(HospitalName);
		System.out.println(DeanName);
		System.out.println(Adrres);
		System.out.println(buildings);
		System.out.println(medicalName);
		System.out.println(NumOfAmbulence);
		System.out.println(DocterSalary);
		System.out.println(consultencyFree);
		System.out.println(NumOfDepartments);
		System.out.println(labs);
		System.out.println( patientsQuer);
		System.out.println(NumOfDocter);
		System.out.println(NumOfSisters);
		System.out.println(NumOfMaleWards);
		System.out.println(NumOfFemaleWards);
		System.out.println(OperationRoom);
		
		if(Departments!=null)
		{
			System.out.println("array is pointing to menory");
			for(int index=0;index<=Departments.length-1;index++)
			{
				String ref=Departments[index];
				
				System.out.println(ref+"Departments"+Departments[index]);
				
			} for(int i=0;i<=Departments1.length-1;i++)
			{
				int ref1=Departments1[i];
				System.out.println(ref1+"Departments1"+Departments1[i]);
			}for(int i=0;i<=Departments2.length-1;i++)
			{
				double ref2=Departments2[i];
				System.out.println(ref2+"Departments2"+Departments2[i]);
				
			}for(int i=0;i<=Departments3.length-1;i++)
			{
				long ref3=Departments3[i];
				System.out.println(ref3+"Departments3"+Departments3[i]);
			}
		}
		else{
			System.out.println("array is  not pointing to menory");
		}
	}
 
	

}
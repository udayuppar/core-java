class HospitalRunner{
	public static void main(String[] moneyMaker)
	{
		System.out.println("********************************************");
		
		Hospital.printDetailse();
		
		Hospital.HospitalName="MAX SuperSpeciality";
		Hospital.DeanName="Mr uday";
		Hospital.Adrres="Shivamoga";
		Hospital.buildings=4;
		Hospital.medicalName="Max medical";
		Hospital.NumOfAmbulence=10;
		Hospital.DocterSalary=50000;
		Hospital.consultencyFree=1000;
		Hospital.NumOfDepartments=8;
		Hospital.HospitalNumber=8861539422l;
		Hospital.labs=2;
		Hospital.patientsQuer=true;
		Hospital.NumOfDocter=20;
		Hospital.NumOfSisters=50;
		Hospital.NumOfMaleWards=5;
		Hospital.NumOfFemaleWards=5;
		Hospital.OperationRoom=5;
		
		String[] health={"Admission","surgery","operation","billings","x-ray","cardiology","gynecology","urology","neurology","hemotology","nutrition and dietetics","orthopedics"};
		Hospital.Departments=health;
		
		String[] operationMaterials ={"bandage","Sponge holdling forceps","stith suture seessor","cutter"};
		Hospital.Departments=operationMaterials;
		
		String[] parkingVehicles={"car","bike","auto","van"};
		Hospital.Departments=parkingVehicles;
		
		int[] freeStructer={300,500,1000,750};
		Hospital.Departments1=freeStructer;
		 
		String[] xrayType={"CT","MRI","angiograpy","chest radiograph","abdominal x-ray"};
		Hospital.Departments=xrayType;
		
		double[] salaryOfDocter={50000d,60000d,55000d,70000d,80000d};
		Hospital.Departments2=salaryOfDocter;
		
		double[] operationFrez={50000,60000,80000,60050};
		Hospital.Departments2=operationFrez;
		
		String[] SpecilistDocter={"eye specilist","heart specilist","dentist","kidney specilist"};
		Hospital.Departments=SpecilistDocter;
		
		String[] DocterName={"uady","akash","ajay","sanjay"};
		Hospital.Departments=DocterName;
		
		long[] HospitalHelpCenter={8861539422l,9741627422l,9632587412l,9874563252l};
		Hospital.Departments3=HospitalHelpCenter;
	
		
		Hospital.printDetailse();
		
		System.out.println("******************************************");
		
		
	}
}
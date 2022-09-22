class GroceryRunner{
	public static void main(String[] shop)
	{
		
		Grocery.printDetailse();
		System.out.println("***********************************");
		
		Grocery.setStoreName("RAM");
		Grocery.setOwnerName("Uday");
		Grocery.setGstNum(984267526554l);
		Grocery.setDepartments(5);
		Grocery.setMonthlyTrunOver(75000d);
		Grocery.setYearTurnOver(500000l);
		Grocery.setElectricBill(500);
		Grocery.setSales(true);
		Grocery.setNumOfComputer(10);
		Grocery.setNumOfWeighingMachine(5);
		Grocery.setLabourName("gottila");
		Grocery.setLabourSalary(25000);
		Grocery.setNumOfLabours(2);
		Grocery.setCompetitor("yaaru");
		Grocery.setType("selling product");
		
		Grocery.printDetailse();
		System.out.println("***********************************");
		
		System.out.println("***********************************");
		String ref1=Grocery.storeName;
		System.out.println("storeName="+ref1);
		
		String ref2=Grocery.ownerName;
		System.out.println("ownerName="+ref2);
		
		double ref3=Grocery.gstNum;
		System.out.println("gstNum="+ref3);
		
		int ref4=Grocery.departments;
		System.out.println("departments="+ref4);
		
		double ref5=Grocery.monthlyTrunOver;
		System.out.println("monthlyTrunOver="+ref5);
		
		long ref6=Grocery.yearTurnOver;
		System.out.println("yearTurnOver="+ref6);
		
		int ref7=Grocery.electricBill;
		System.out.println("electricBill="+ref7);
		
		boolean ref8=Grocery.sales;
		System.out.println("sales="+ref8);
		
		int ref9=Grocery.numOfComputer;
		System.out.println("numOfComputer="+ref9);
		
		int ref10=Grocery.numOfWeighingMachine;
		System.out.println("numOfWeighingMachine="+ref10);
		
		String ref11=Grocery.labourName;
		System.out.println("labourName="+ref11);
		
		double ref12=Grocery.labourSalary;
		System.out.println("labourSalary="+ref12);
		
		int ref13=Grocery.numOfLabours;
		System.out.println("numOfLabours="+ref13);
		
		String ref14=Grocery.competitor;
		System.out.println("competitor="+ref14);
		
		String ref15=Grocery.type;
		System.out.println("type="+ref15);
	}	
}
class SportsRunner{
	public static void main(String[] teams)
	{
		System.out.println("main start execution");
		String[] cricketTeamMember={"Virat","ABD","KL Rahul","Maxwell","DK","Gayle","Dhoni","Chahal","patidar","hasaranga"};
		Sports.cricketTeamMember(cricketTeamMember);
		
		  
		
		int[] nos={18,17,52,54,89,14,23,56,41,35,4};
		Sports.kabbadiTeamMembersJerseyNos(nos);
		
		double[] salaries={20000,50000,25000,36000,25500,55000,36400,65000,58000,70000};
		Sports.FootBallTeamMembersSalary(salaries);
		
		long[] mobnum={8861539422l,9741627422l,7259232100l,8546123698l,9632587412l,8654123654l,7456981233l,9658231456l,7549861359l,9669696369l};
		Sports.LudoTeamMobileNumbers(mobnum);
		
		int[] matches={5,10,8,6,11,15,52,25,42,63};
		Sports.HockeyTeamMembersNoOfMatches(matches);
		
		long[] codes={919636362532l,918562365232l,918745125412l,916325412563l,918745987469l,916547891236l,915698745123l,916987452365l,916987451258l,916875490250l};
		Sports.KokkoTeamMembersContryCode(codes);
		
		System.out.println("main end execution");
	}
}
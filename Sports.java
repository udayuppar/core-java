class Sports{
	static void cricketTeamMember(String[] cricketTeamMember)
	{
		
		System.out.println("Entered cricketTeamMember name");
		for(int index=0; index<cricketTeamMember.length; index++)
		{
			String ref=cricketTeamMember[index];
			System.out.println("cricketTeamMember:"+ref);
		}
	
	}
	static void kabbadiTeamMembersJerseyNos(int[] nos)
	{
		System.out.println("Entered jersey nos");
		for(int index=0; index<nos.length; index++)
		{
			int ref=nos[index];
			System.out.println("kabbadiTeamMembersJerseyNos:"+ref);
		}
	}
	static void FootBallTeamMembersSalary(double[] salaries)
	{
		System.out.println("Entered team members salaries");
		for(int index=0; index<salaries.length; index++)
		{
			double ref=salaries[index];
			System.out.println("salaries:"+ref);
		}
	}
	static void LudoTeamMobileNumbers(long[] mobnum)
	{
		System.out.println("Entered team members mobile number");
		for(int index=0; index<=mobnum.length-1; index++)
		{
			long ref=mobnum[index];
			System.out.println("mobile number:"+ref);
		}
	}
	static void HockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Entered no of matches");
		for(int index=0; index<=matches.length-1; index++)
		{
			int ref=matches[index];
			System.out.println("no of matches:"+ref);
		}
	}
	static void KokkoTeamMembersContryCode(long[] codes)
	{
		System.out.println("Entered contry code");
		for(int index=0; index<=codes.length-1; index++)
		{
			long ref=codes[index];
			System.out.println("contry code:"+ref);
		}
	}
}

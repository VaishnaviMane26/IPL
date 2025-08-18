package reposiratory;

import entity.Team;

public class TeamRepository {

	public static Team getMIDetails()
	{
		Team team=new Team();
		team.setId(101);
		team.setTeamName("mumbai Indians");
		team.setCaptainName("hardik pandya");
		team.setCoachName("jaywardhana");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	//add similar methods for remaining 9 teams
	
	public static Team getRCBDetails()
	{
		Team team=new Team();
		team.setId(102);
		team.setTeamName("Royal Challengers Banglore");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Ravi Shastri");
		team.setQualified(true);
		team.setnRR(2.3f);
		team.setShortName("RCB");
		return team;
	}
	
	public static Team getGTDetails()
	{
		Team team=new Team();
		team.setId(103);
		team.setTeamName("gujrat titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("	Ashish Nehra");
		team.setQualified(false);
		team.setnRR(7.3f);
		team.setShortName("GT");
		return team;
	}
	
	public static Team getCSKDetails()
	{
		Team team=new Team();
		team.setId(104);
		team.setTeamName("chennai super kings");
		team.setCaptainName("MSD");
		team.setCoachName("	Stephen Fleming");
		team.setQualified(false);
		team.setnRR(1.3f);
		team.setShortName("CSK");
		return team;
	}
	public static Team getpksDetails()
	{
		Team team=new Team();
		team.setId(105);
		team.setTeamName("Kings 11 punjab");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Ricky Ponting");
		team.setQualified(false);
		team.setnRR(9.3f);
		team.setShortName("PK");
		return team;
	}
	public static Team getDCDetails()
	{
		Team team=new Team();
		team.setId(106);
		team.setTeamName("delhi capitals");
		team.setCaptainName("rishabh pant");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(11.3f);
		team.setShortName("DC");
		return team;
	}
	public static Team getLSGDetails()
	{
		Team team=new Team();
		team.setId(107);
		team.setTeamName("Lucknow super giants");
		team.setCaptainName("rishabh pant");
		team.setCoachName("vacant");
		team.setQualified(false);
		team.setnRR(9.3f);
		team.setShortName("LSG");
		return team;
	}
	public static Team getRRDetails()
	{
		Team team=new Team();
		team.setId(108);
		team.setTeamName("rajastan royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("rahul dravid");
		team.setQualified(false);
		team.setnRR(8.3f);
		team.setShortName("RR");
		return team;
	}
	public static Team getKKRDetails()
	{
		Team team=new Team();
		team.setId(109);
		team.setTeamName("kolkatta night riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("vacant");
		team.setQualified(false);
		team.setnRR(8.3f);
		team.setShortName("KKR");
		return team;
	}
	public static Team getSRHDetails()
	{
		Team team=new Team();
		team.setId(110);
		team.setTeamName("sunriser hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("	Daniel Vettori");
		team.setQualified(false);
		team.setnRR(4.3f);
		team.setShortName("SRH");
		return team;
	}
}


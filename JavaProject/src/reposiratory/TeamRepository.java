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
		return team;
	}
	//add similar methods for remaining 9 teams
}

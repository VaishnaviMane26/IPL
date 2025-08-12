package service;

import entity.Team;
import reposiratory.TeamRepository;

public class TeamService {
  
  public void printTeamdetails(){
	  Team team=TeamRepository.getMIDetails();
	  System.out.println(team.getId());
	  System.out.println(team.getTeamName());
	  System.out.println(team.getCaptainName());
	  System.out.println(team.getCoachName());
	  System.out.println(team.getnRR());
	  System.out.println(team.isQualified());

	  }
}

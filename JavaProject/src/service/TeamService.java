package service;

import java.util.Scanner;

import entity.Team;
import reposiratory.TeamRepository;

public class TeamService {
	
	//Implement Scanner for take input from user
	
	public void selectOption(){
		Scanner sc =new Scanner(System.in);
   
     System.out.println("welcome to IPL portal");
     System.out.println("Please Select Following Option");
     System.out.println("1. Get All Team Details");
     System.out.println("2. Get team Details By shortname");
     System.out.println("3. Get Team Details By TeamId");
     
     int input=sc.nextInt();
     //System.err.println("yo have selected Option : "+input);
     
     switch(input) {
       
     case 1: {
    	 System.out.println(TeamRepository.getMIDetails());
    	 System.out.println(TeamRepository.getRCBDetails());
    	 System.out.println(TeamRepository.getCSKDetails());
    	 System.out.println(TeamRepository.getDCDetails());
    	 System.out.println(TeamRepository.getGTDetails());
    	 System.out.println(TeamRepository.getKKRDetails());
    	 System.out.println(TeamRepository.getLSGDetails());
    	 System.out.println(TeamRepository.getpksDetails());
    	 System.out.println(TeamRepository.getRRDetails());
    	 System.out.println(TeamRepository.getSRHDetails());
    	 
    	 break;
     }
     
    case 2:{
    	 System.out.println("Please Enter ur teams shortnamee : ");
    	 String shortname=sc.next();
    	 System.out.println("enter the ur favourite team name : "+shortname);
    	 getTeamByShortname(shortname);
    	 break;
     }
    
    case 3:
    {
    System.out.println("Please enter ur team details by TeamId : ");
    int teamid1=sc.nextInt();
    printTeamDetails((teamid1));
    break;
    }
    
     default:
    	 throw new IllegalArgumentException("unexpected value :"+ input);
     }
       
	}
	
	 private void printTeamDetails(int id) {
		if(id==101)
		{
			System.out.println("The Details Of MI :"+TeamRepository.getMIDetails());
			
		}else if(id==102)
		{
			System.out.println(TeamRepository.getRCBDetails());
		} 
		else if(id==103)
		{
			System.out.println(TeamRepository.getCSKDetails());
		} 
		else if(id==104)
		{
			System.out.println(TeamRepository.getDCDetails());
		} 
		else if(id==105)
		{
			System.out.println(TeamRepository.getGTDetails());
		} 
		else if(id==106)
		{
			System.out.println(TeamRepository.getKKRDetails());
		} 
		else if(id==107)
		{
			System.out.println(TeamRepository.getLSGDetails());
		} 
		else if(id==108)
		{
			System.out.println(TeamRepository.getpksDetails());
		} 
		else if(id==109)
		{
			System.out.println(TeamRepository.getRRDetails());
		} 
		else if(id==110)
		{
			System.out.println();
		} 
		else {
			System.out.println("Invalid Id");
		}
	}

	 private void getTeamByShortname(String shortName)
	{
		switch(shortName){
		case "MI":
		{
			System.out.println(TeamRepository.getMIDetails());
			break;
		}
		case "RCB":
		{
			System.out.println(TeamRepository.getRCBDetails());
			break;
		}
		
		case "GT":
		{
			System.out.println(TeamRepository.getGTDetails());
			break;
		}
		
		case "CSK":
		{
			System.out.println(TeamRepository.getCSKDetails());
			break;
		}
		
		case "PK":
		{
			System.out.println(TeamRepository.getpksDetails());
			break;
		}
		
		case "DC":
		{
			System.out.println(TeamRepository.getDCDetails());
			break;
		}
		
		case "LSG":
		{
			System.out.println(TeamRepository.getLSGDetails());
			break;
		}
		
		case "RR":
		{
			System.out.println(TeamRepository.getRRDetails());
			break;
		}
		
		case "KKR":
		{
			System.out.println(TeamRepository.getKKRDetails());
			break;
		}
		
		case "SRH":
		{
			System.out.println(TeamRepository.getSRHDetails());
			break;
		}
		}
		
		   
	}
	
	
 
  /*public void printTeamdetails(){
	  
	  Team team=TeamRepository.getMIDetails();
	  System.out.println(team);
	  System.out.println(team.getId());
	  System.out.println(team.getTeamName());
	  System.out.println(team.getCaptainName());
	  System.out.println(team.getCoachName());
	  System.out.println(team.getnRR());
	  System.out.println(team.isQualified());

	 
  Team team1=TeamRepository.getRCBDetails();
  System.out.println(team1);
  System.out.println(team);
  System.out.println(team.getId());
  System.out.println(team.getTeamName());
  System.out.println(team.getCaptainName());
  System.out.println(team.getCoachName());
  System.out.println(team.getnRR());
  System.out.println(team.isQualified());

}*/
}
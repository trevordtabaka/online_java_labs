package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */


class League{

    private static String leagueName = "myLeague";
    private static int teamCount = 0;
    private static int maxTeams = 10;
    String[] leagueTeams = new String[9];

// 1) Start
    public static String getLeagueName(){


        return leagueName;
    }

    public static int getTeamCount(String league){

        if(league == getLeagueName()){
            return teamCount;
        }else{
            System.out.println("Cannot access that league");
            return 0;
        }
    }
// End 1)
// for 2), I dont believe this can be done?
//  The following 2 methods satisfy both 3) and 4).. I believe

    public void newTeamRequest(String teamName){

        if(addTeam(teamName)){

            System.out.println("Your admission into the league was accepted. Congratulations you are team number " + teamCount + "in the league");
        }else{
            System.out.println("Sorry your request to join the league has failed. The league is full");
        }


    }

    public  boolean addTeam(String teamName){

        if(teamCount < maxTeams){
            leagueTeams[teamCount] = teamName;
            teamCount++;
            return true;
        }else{
            return false;

        }

    }




}
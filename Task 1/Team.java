class Team{

private String teamName;
private int rank;

public Team(String teamName){
this.teamName = teamName;


}
public String getteamName(){
return teamName;

}
void setrank(int rank){
this.rank = rank;
}
public String toString(){
    return "Team:" + teamName + " Rank:" + rank;
}

}
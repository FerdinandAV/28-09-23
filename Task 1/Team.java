class Team{

private String teamName;
private int rank;

public Team(String teamName){
this.teamName = teamName;

}
public void setrank(int rank){
this.rank = rank;
}
public String toString(){
    return "Team:" + teamName + " Rank:" + rank;
}

}
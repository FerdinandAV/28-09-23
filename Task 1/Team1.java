class Team{

private String teamName;
private String memberName;
private int rank;

Team(String teamName, String memberName, int rank){
this.teamName = teamName;
this.memberName = memberName;
this.rank = rank;

}
public String getteamName(){
return teamName;

}

public String getmemberName(){
return memberName;

}

public int getrank(){
return rank;
}

void setrank(int rank){
this.rank = rank;

}
}
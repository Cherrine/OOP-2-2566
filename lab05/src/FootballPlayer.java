public class FootballPlayer extends Player{
    
    private int playerNumber;
    private String position;
    
    public int getPlayerNumber(){
        return playerNumber;
    }
    
    public String getPosition(){
        return position;
    }
    
    public void setPlayerNumber(int n){
        playerNumber = n;
    }
    
    public void setPosition(String p){
        position = p;
    }
    
    public boolean isSamePosition (FootballPlayer p) {
        return ((p.getPosition().equals(this.getPosition()))&(p.getTeam().equals(this.getTeam())));
    }    
}

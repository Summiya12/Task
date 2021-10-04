package SummiyaHussain;

public class Cricket extends Sports {
    String matchType;
    int over;
    Players players;

    Cricket(String matchType,int over,Players players){
        this.matchType = matchType;
        this.over = over;
        this.players = players;

    }
    void display(){
        System.out.println("Match type :"+matchType);
        System.out.println("Over of the match :"+over);
        System.out.println("Name of the player :"+players.playerName);
        System.out.println("Jersey number of a player :"+players.jerseyNumber);
    }

}
/*
Name = Summiya Hussain
ID = 2012020077
SEC = B
EMAIL = cse_2012020077@lus.ac.bd
DATE = 11.09.21
 */
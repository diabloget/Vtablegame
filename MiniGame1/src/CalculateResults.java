public class CalculateResults {

    String[] player1;
    String[] player2;

    public CalculateResults(String[] player1, String[] player2){
        this.player1=player1;
        this.player2=player2;
    }
    public String winner() {
        if(player1[0]==player2[1]&&player2[0]!=player1[1]){
            return "player2";
        }else {if(player2[0]==player1[1]&&player1[0]!=player2[1]){
            return "player1";
        }else{
            return "tie";
        }

    }

}
    public void showScore(){
        switch (winner()){
            case "player1":{

            }
            case "player2":{

            }
            case "tie":{

            }
        }
    }
}

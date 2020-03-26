public class KeepingScore {
    int numberOfPlayers;
    int[] scores;
    private int whichPlayer=0;
    KeepingScore(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
        this.scores = new int[numberOfPlayers];
        for(int s : scores){
            s=1;
        }
    }


    public boolean winOrLoose(String[] answers, String[] moves) {
        for(int counter = 0; counter<5; counter++){
            if(!answers[counter].equals(moves[counter])){
                whichPlayer++;
                return false;
            }
        }return true;
    }


}

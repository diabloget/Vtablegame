public class DecideWinner {

    public boolean isWinner(int column, int row, String[][] gameMatrix){
        return winnerHorizontal(row,column, gameMatrix) || winnerVertical(column, row, gameMatrix) || winnerDiagonal(column, row, gameMatrix);
    }
    public boolean winnerDiagonal(int column, int row, String[][] gameMatrix){
        int counterA = 0;
        int counterB = 0;
        for(int y = row; y>=0; y--){
            for(int x = column; x<=6; x++){
                if(gameMatrix[row][column].equals(gameMatrix[y][x])){
                    counterA++;
                }else{
                    break;
                }
            }
        }
        for(int y = row; y<=5; y++){
            for(int x = column; x>=0; x--){
                if(gameMatrix[row][column].equals(gameMatrix[y][x])){
                    counterB++;
                }else{
                    break;
                }
            }
        }
        if(counterA+counterB==4){
            System.out.println("diagonal1");
            return true;
        }else{
            counterA = 0;
            counterB = 0;
            for(int y = row; y>=0; y--){
                for(int x = column; x>=0; x--){
                    if(gameMatrix[row][column].equals(gameMatrix[y][x])){
                        counterA++;
                    }else{
                        break;
                    }
                }
            }
            for(int y = row; y<=5; y++){
                for(int x = column; x<=6; x++){
                    if(gameMatrix[row][column].equals(gameMatrix[y][x])){
                        counterB++;
                    }else{
                        break;
                    }
                }
            }
            if(counterA+counterB==4){
                System.out.println("diagonal2");
                return true;
            }else{
                return false;
            }
        }
    }


    public boolean winnerVertical(int column,int row, String[][] gameMatrix){
        int counter4=0;
        for( int y=row;y<6;y++){
            if( gameMatrix[ y ][ column ].equals(gameMatrix[row][column]) ){
                counter4++;
            }else {
                counter4=0;
            }
            if(counter4==4){
                System.out.println("vertical");
                return true;
            }

        }
        return false;
    }

    public boolean winnerHorizontal(int row, int column, String[][] gameMatrix) {
        int counter4 = 0;
        for ( int x = 0; x < 7; x++ ) {
            if ( gameMatrix[row][column].equals(gameMatrix[ row ][ x ]) ) {
                counter4++;
            }
            else {
                counter4 = 0;
            }
            if ( counter4 == 4 ) {
                System.out.println("horizontal");
                return true;
            }
        }
        return false;
    }
}

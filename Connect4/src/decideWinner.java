public class decideWinner {
    String[][] gameMatrix;
    decideWinner(String[][] gameMatrix){
        this.gameMatrix=gameMatrix;

    }

    public boolean winnerDiagonal(int column, int row, String color){
        int counter4 = 0;
        int y = row;
        int x = column;
        while (x > 0 && y > 0) {
            x--;
            y--;
        }
        for ( int rowDiagonal = y; rowDiagonal < 6; rowDiagonal++ ) {
            for ( int columnDiagonal = x; columnDiagonal < 7; columnDiagonal++ ) {
                if ( gameMatrix[ rowDiagonal ][ columnDiagonal ].equals(color) ) {
                    counter4++;
                } else {
                    counter4 = 0;
                }
                if ( counter4 == 4 ) {
                    return true;
                }
            }
        }
        counter4 = 0;
        y = row;
        x = column;
        while (y > 0 && x < 6) {
            y--;
            x++;
        }
        for ( int rowDiagonal = y; rowDiagonal > 0; rowDiagonal-- ) {
            for ( int columnDiagonal = x; columnDiagonal > 0 ; columnDiagonal-- ) {
                if ( gameMatrix[ rowDiagonal ][ columnDiagonal ].equals(color) ) {
                    counter4++;
                } else {
                    counter4 = 0;
                }
                if ( counter4 == 4 ) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean winnerVertical(int column,int row, String color){
        int counter4=0;
        for( int y=row;y<=7;y++){
            if( gameMatrix[ y ][ column ].equals(color) ){
                counter4++;
            }else {
                counter4=0;
            }
            if(counter4==4){
                return true;
            }

        }
        return false;
    }

    public boolean winnerHorizontal(int row, String color) {
        int counter4 = 0;
        for ( int column = 0; column < 6; column++ ) {
            if ( color.equals(gameMatrix[ row ][ column ]) ) {
                counter4++;
            }
            else {
                counter4 = 0;
            }
            if ( counter4 == 4 ) {
                return true;
            }
        }
        return false;
    }
}

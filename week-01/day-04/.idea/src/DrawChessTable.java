public class DrawChessTable {
    public static void main(String[] args) {
        int row = 8;
        int column = 5;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i % 2 != 0) && (j == 0)) {
                    System.out.print(" ");
                }
                System.out.print("%");


                if (i % 2 == 0 && j == column-1 ) {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }
    }
}

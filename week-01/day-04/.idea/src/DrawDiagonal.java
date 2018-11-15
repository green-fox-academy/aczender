import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {
        System.out.print("Number for diagonal: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[][] diagonal = new int[number][number];

        for (int i = 0; i < diagonal.length; i++) {

            for (int j = 0; j < diagonal[i].length; j++) {
                if (diagonal[i] == diagonal[0] || diagonal[i] == diagonal[diagonal.length-1]) {
                    System.out.print("%");
                } else if (i == j){
                    System.out.print("%");
                } else if (diagonal [j] == diagonal[0] || diagonal [j] == diagonal[diagonal.length-1]){
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


import java.util.Scanner;

public class TinhTongMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chon cot muom tinh tong");
        int number = scanner.nextInt();
        int sum = 0;
        int[][] array = {
                {1, 3, 4, 5},
                {6, 7, 8, 9},
                {4, 5, 4, 3},
                {3, 4, 6, 9}

        };
        System.out.println(array[0][1]);
        System.out.println(array[1][1]);
        System.out.println(array[2][1]);
        System.out.println(array[3][1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == number) {
                    sum += array[j][number];
                }
            }
        }
        System.out.println("tong cot " + number + " la : " + sum);
    }
}
package pertemuan3.code7;

public class Bingo {
    static String kata = "BINGO";

    public Bingo(String kata) {
        this.kata = kata;
    }

    public static void bingoClap() {
        char[] arr = kata.toCharArray();

        for (int i = 0; i < 5; i++) {
            System.out.println("\nThere was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o");

            for (int j = 0; j < 3; j++) {
                arr[i] = '*';

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == '*') {
                        System.out.print("(clap)");
                    } else {
                        System.out.print(arr[k]);
                    }

                    if (k < arr.length - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println("And Bingo was his name-o");
        }
    }

    public static void main(String[] args) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("And Bingo was his name-o");

        bingoClap();
    }
}

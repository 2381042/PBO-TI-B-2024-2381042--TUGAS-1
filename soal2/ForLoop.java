package soal2;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int inputN;
        Scanner input  = new Scanner(System.in);
        System.out.println("Masukkan jumlah tangga yang anda inginkan : ");
        inputN = input.nextInt();
        for (int i = 1; i <= inputN; i++){
            for (int j = 0; j < inputN; j++){
                if (j < ( inputN - i)){
                    System.out.println(" ");
                }else {
                    System.out.println("#");
                }
            }
            System.out.println();
        }
    }
}

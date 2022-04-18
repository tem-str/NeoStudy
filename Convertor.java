import java.util.Scanner;
import java.lang.StringBuilder;

public class NeoStudy {

    public static String decToHex(int dec) {
        int sizeOfIntInHalfBytes = 8;
        int numberOfBitsInAHalfByte = 4;
        int halfByte = 0x0F;
        char[] hexDigits = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
            int j = dec & halfByte;
            hexBuilder.setCharAt(i, hexDigits[j]);
            dec >>= numberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dec = scan.nextInt();
        int a = dec;
        int b;
        
        String hex = decToHex(dec);
        String temp = "";
        
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        
        System.out.println("При переводе в шестнадцатиричную сс = " + hex);
        System.out.println("При переводе в двоичную сс = " + temp);
        System.out.println("Введите двоичное число: ");

        Scanner scan2 = new Scanner(System.in);
        String num = scan2.nextLine();
        System.out.println(Integer.parseInt(num,2));
        };
}

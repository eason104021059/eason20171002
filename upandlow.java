import java.util.Scanner;

    public class upandlow  //2017.10.2 課堂練習 輸入字元 判別大寫小寫特殊符號
    {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            char ch = scn.next().charAt(0);
            if
                    (ch - 'A' >= 0 && ch - 'A' < 26) {
                System.out.println("uppercase");
            } else {
                if (ch - 'a' >= 0 && ch - 'a' < 26) {
                    System.out.println("lowercase");
                } else System.out.println("special character)");
            }
        }
    }

import java.util.Scanner;

    public class triangleABC //2017.10.2課堂練習 判別是否為三角形

    {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if (a<=b && b<=c &&(a+b)>c){
            System.out.println("TRUE");
        }else System.out.println("FALSE");

        }
    }

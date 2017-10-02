import java.util.Scanner;

public class ifelse1 //2017.10.2 課堂練習 判別機數偶數 if-else
    {

        public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            int v1 =scn.nextInt();
            if (v1 % 2==0)
             System.out.println("偶數");
            else
            { System.out.println("奇數");
            }
        }
    }


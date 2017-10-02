import java.util.Scanner;

public class ifelse2 //2017.10.2 課堂練習 判別是否及格 if-else
{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int v1 =scn.nextInt();
        if (v1 >=60)
            System.out.println("Pass!!");
        else
        { System.out.println("Fail!!");
        }
    }
}


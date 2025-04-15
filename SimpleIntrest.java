 import java.util.Scanner;

public class SimpleIntrest{
    public static void main(String[] args) {
        float p,r,t,SIntrest;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Principle");
        p=scan.nextFloat();
        System.out.println("Enter the Rate of Intrest");
        r=scan.nextFloat();
        System.out.println("Enter the Time Period");
        t=scan.nextFloat();
        scan.close();
        SIntrest=(p*r*t)/100;
        System.out.println("Simple Intrest Is:" + SIntrest);
        System.out.println("This is first Intrest " );
        

    }
}

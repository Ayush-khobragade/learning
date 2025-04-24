package s2pclass;

import java.util.Scanner;
public class Sec8_05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter 1st number");
        float f1= sc.nextFloat();

        System.out.println("Enter 2nd number");
        float f2=sc.nextFloat();

        System.out.println("Enter 3rd number");
        float f3=sc.nextFloat();

        float s=(f1+f2+f3)/2f;
        float area=(float)Math.sqrt((s*(s-f1)*(s-f2)*(s-f3)));
        System.out.println(area);

    }
}

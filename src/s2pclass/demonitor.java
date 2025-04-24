package s2pclass;
import java.util.Scanner;
public class demonitor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator");
        int n = sc.nextInt();

        System.out.println("Enter denominator");
        int d = sc.nextInt();

        int result= n/d;
        if(d==0){
            System.out.println("Error");

        }
        else{
            System.out.println("result" + result);
        }

    }
}

import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        int x;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        x=sc.nextInt();
        if(x>=0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

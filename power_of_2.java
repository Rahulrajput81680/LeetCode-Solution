import java.util.Scanner;

public class power_of_2{
    public static boolean power(int n){
        if (n <= 0) {
            return false;
        }else{
            return n&(n-1)==0;
        }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n= sc.nextInt();
       
    }
}
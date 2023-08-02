import java.util.Scanner;

public class reverse_string{
    public static void reverse(char[] s){
    int left=0;
    int right=s.length-1;
    

    while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        left++;
        right--;
    }
    }
    public static void main(String[] args) {
       String s="rahul";
       System.out.println(reverse(s));
    }
}
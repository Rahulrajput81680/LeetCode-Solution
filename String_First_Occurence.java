import java.util.Scanner;

public class String_First_Occurence{
    public static int occurence(String heystack, String needle){
        for(int i=0;i<heystack.length()-needle.length()+1;i++){
            if(heystack.charAt(i)==needle.charAt(0)){
                if(heystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String heystack=sc.next();
        System.out.println("enter string to find");
        String needle = sc.next();
        System.out.println(occurence(heystack, needle));

    }
}
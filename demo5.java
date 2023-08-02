public class demo5{
    public static void reverse(String str){
        String temp=0;
        
        for(int i=0;i<str.length()/2;i++){
            temp=str.charAt(i);
            str.charAt(i)=str.charAt(str.length-i-1);

        }
    }
   public static void main(String[] args) {
    System.out.println("hi all");
   }
}
    
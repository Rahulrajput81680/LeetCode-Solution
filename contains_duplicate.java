public class contains_duplicate{
    public static boolean duplicate(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            for(int j=arr.length;i>=arr.length/2;i--){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
            break;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,2,1,2,9};
        System.out.println(duplicate(arr));

    }
}
public class sliding_window{
    //using brute force approach
    public static void main(String[] args) {
        int arr[]={2,4,5,8,7,3,1,9};
        int k=3;

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-k+1;i++){
            int current_sum=0;
            for(int j=0;j<k;j++){
                current_sum=current_sum+arr[i+j];
            }
            max=Math.max(max, current_sum);
        }
        System.out.println(max);
    }
}
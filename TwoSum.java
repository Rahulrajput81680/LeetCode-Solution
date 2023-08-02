public class TwoSum{
    public static int twoSum(int num[],int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int num[] = {5,4,7,8,9};
        int target = 9;
        twoSum(num, target);
        //System.out.println(twoSum(num, target));

    }
}

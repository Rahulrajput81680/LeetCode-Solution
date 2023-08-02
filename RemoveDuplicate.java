public class RemoveDuplicate{
    public static int removeDuplicate(int nums[],int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={5,4,6,8,5,4,5,4,8,5};
        int val=5;
        System.out.println(removeDuplicate(nums, val));
    }
}
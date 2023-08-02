public class Duplicates_Remove{
    public int removeDuplicates(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int nums[]= {5,5,4,4,7,7,8};
      
    }
       
    
}

    
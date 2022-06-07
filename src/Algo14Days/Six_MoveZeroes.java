package Algo14Days;

public class Six_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j,len=nums.length;
        for(i=0;i<len;i++){

            if(nums[i]==0){
                for(j=i;j<len;j++){
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    } }
            } }
    }

    public static void main(String args[]){
        int[] nums = {0,1,0,3,12};
        Six_MoveZeroes o = new Six_MoveZeroes();
        o.moveZeroes(nums);
        for(int i : nums){
            System.out.print(i+"  ");
        }
    }
}

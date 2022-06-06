package Algo14Days;



public class Five_RotateArraybyKSteps {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k %= n;
        flip(nums,0,n-1);
        flip(nums,0,k-1);
        flip(nums,k,n-1);
    }
    public void flip(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7};
        Five_RotateArraybyKSteps o = new Five_RotateArraybyKSteps();
        o.rotate(nums,3);
    }
}

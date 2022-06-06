package Algo14Days;

public class Three_SearchInsertPosition {

    int binarysearch(int nums[],int target){ //O(log n) Time Complexity
        int left = 0,right= nums.length-1,mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                right=mid-1;
            else if(nums[mid]<target)
                left=mid+1;
        }
        return left;
    }

    public static void main(String args[]){
        int arr[] = {1,2,6,8,11};
        int target = 8;
        Three_SearchInsertPosition o = new Three_SearchInsertPosition();
        System.out.println(o.binarysearch(arr,target));
    }
}

package Algo14Days;

public class One_BinarySearch {
    int binarysearch(int arr[],int target){
        int left=0,right= arr.length-1,mid;

        while(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
         int arr[] = {1,2,6,8,11};
         int target = 8;
        One_BinarySearch o = new One_BinarySearch();
        System.out.println(o.binarysearch(arr,target));

    }
}

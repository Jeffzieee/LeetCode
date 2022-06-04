package Algo14Days;


public class Four_SumofSquares {

    int[] sortedSumofSquares(int[] nums){
        int[] sorted = new int[nums.length];
        int left = 0,right=sorted.length-1;
        int index=right;

        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                sorted[index]=nums[left]*nums[left];
                left++;
            }
            else {
                sorted[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return sorted;
    }

    public static void main(String args[]){

        int[] sorted = {-4,-1,0,3,10};
        System.out.println("Initial Sorted Array");

        for(int i=0;i<sorted.length;i++){
            System.out.print(" "+sorted[i]);
        }

        Four_SumofSquares f = new Four_SumofSquares();
        int[] sortedSquares = f.sortedSumofSquares(sorted);
        System.out.println("\nSorted Squares");

        for(int i=0;i<sortedSquares.length;i++){
            System.out.print(" "+sortedSquares[i]);
        }
    }
}

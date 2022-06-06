package Algo14Days;
//Problem Was solved in Leetcode Console
public class Two_FirstBadVersion {


    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /*
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) { //O(log n) Time Complexity
            int left=0,right=n-1,mid;
            while(left<=right){
                mid=left+(right-left)/2;
                if(isBadVersion(mid))
                    right=mid-1;
                else
                    left=mid+1;
            }
            return left;
        }
*/
    }


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //here we are solve this problem using a linear search
        // int index=0;
        // for(int i=1;i<=n;i++){
        //     boolean check=isBadVersion(i);  //here we can check the method of a parent class
        //     if(check==true){
        //          index=i;
        //         // break;
        //         return index;
        //     }
        // }
        // return index;


        //now we can solve this problem using a binary search
        int left = 1;
    int right = n;

    while(left < right){
        int mid = left + (right - left) / 2;

        if(isBadVersion(mid)){
            right = mid;   // first bad version is at mid or before
        }else{
            left = mid + 1; // move to right half
        }
    }

    return left;
    }
}
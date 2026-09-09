class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x/2;

        if(x<2){
            return x;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            long sqr=(long)mid*mid;
            if(sqr==x){
                return (int) mid;
            }
            if(sqr<x){
                left=mid+1;
            }
            else if(sqr>x){
                right=mid-1;
            }

            
        }
        return right;
    }
}
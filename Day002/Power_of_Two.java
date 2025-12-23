class Solution {
    public boolean isPowerOfTwo(int x) {
      if(x==0){
          return false;
      }

      while(x%2==0){
          x = x/2 ;
      }

      if(x==1){
          return true ;
      }else{
          return false;
      }
    }
}

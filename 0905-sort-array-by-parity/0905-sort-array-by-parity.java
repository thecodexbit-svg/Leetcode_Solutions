class Solution {
    public int[] sortArrayByParity(int[] arr) {
      int p1 = 1;
      int p2 = arr.length-1;
      while(p1<=p2){
        if(arr[p1]%2==0){
          p1++;
        }else if(arr[p2]%2!=0){
          p2--;
        }else{
          swap(arr,p1,p2);
          p1++;
          p2--;
        }
      }
      swap(arr , 0 , p2);
      return arr;
    }
    private void swap(int []arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
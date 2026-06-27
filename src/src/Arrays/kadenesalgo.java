package Arrays;

public class kadenesalgo {
    public static int maxSub(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
                maxi=Math.max(sum,maxi);
            }
        }return maxi;
    }
    public static  void main(String args[]){

        int arr[]={1,2,-2,3,4,5,-1};
        System.out.println(maxSub(arr));
    }
}

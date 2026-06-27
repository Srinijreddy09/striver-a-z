package Arrays;

public class MaximumConsecutiveOne {
    public static void one(int arr[]){
        int count=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){

                if(arr[i]==1){
                    count+=1;

                }else{
                    count=0;
            }maxi=Math.max(maxi,count);

        }System.out.println(count);
    }public static void main(String args[]){
        int arr[]={1,1,0,1,0,1,1,1,1};
        one(arr);
    }
}

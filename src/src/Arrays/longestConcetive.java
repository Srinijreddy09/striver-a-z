package Arrays;

import java.util.HashSet;

public class longestConcetive {
    public static boolean linearSearch(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }return false;

    }
    public static int longest(int arr[]){
        int longest_number=0;

        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            while(linearSearch(arr,x+1)){
                count=count+1;
                x=x+1;
            }longest_number=Math.max(count,longest_number);
        }return longest_number;

    }
    public static int optimal(int []arr){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int longest=0;
        for(int itr:set){
            if(!set.contains(itr-1)){
                int count=1;
                int x=itr;
                while(set.contains(x+1)){
                    count+=1;
                    x=x+1;
                }longest=Math.max(count,longest);
            }
        }return longest;
    }
    public static void main(String[] args){
        int arr[]={1,2,100,3,101,102,103};
        System.out.println(optimal(arr));

    }
}

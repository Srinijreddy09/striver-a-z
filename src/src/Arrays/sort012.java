package Arrays;

public class sort012 {
    public static void sort(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count1++;
            }else if(arr[i]==0){
                count0++;
            }else{
                count2++;
            }
        }
        int i=0;
        while(i<count0){
            arr[i]=0;
            i++;
        }
        int j=count0;
        while(j<count0+count1){
            arr[j]=1;
            j++;
        }
        int k=count0+count1;
        int n=arr.length;
        while(k<n){
            arr[k]=2;
            k++;
        }
        for(int r=0;r<n;r++){
            System.out.print(arr[r]+" ");

        }

    }
    public static void optimal(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;

            }else if(arr[mid]==1){
                mid=mid+1;

            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr[]={0,2,1,1,1,2,0};

        optimal(arr);

    }
}

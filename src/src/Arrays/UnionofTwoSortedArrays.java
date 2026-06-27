    package Arrays;

    import java.util.ArrayList;
    import java.util.HashSet;

    public class UnionofTwoSortedArrays {
        public static void  Union(int arr[],int arr1[]){
            HashSet<Integer>set=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                set.add(arr[i]);
            }
            for(int i=0;i<arr1.length;i++){
                set.add(arr1[i]);
            }
            System.out.println();
            for(int itr:set){
                System.out.print(itr+" ");
            }


        }
        public static void UnionOptimal(int arr[],int arr1[]){
            int n=arr.length;
            int m=arr1.length;
            int i=0;
            int j=0;
            System.out.println();
            ArrayList<Integer>union=new ArrayList<>();
            while(i<n && j<m){
                if(arr[i]<arr1[j]){
                    if(union.isEmpty()||union.get(union.size()-1)!=arr[i]){
                        union.add(arr[i]);}
                        i++;


                }else if(arr[i]>arr1[j]){
                    if(union.isEmpty()||union.get(union.size()-1)!=arr1[j]){
                        union.add(arr1[j]);}
                         j++;

                }else{
                    if(union.isEmpty()||union.get(union.size()-1)!=arr[i]){
                        union.add(arr[i]);


                    }i++;
                    j++;
                }
            }
            while(i<n){
                if(union.get(union.size()-1)!=arr[i]){
                    union.add(arr[i]);}
                    i++;

            }while(j<m){
                if(union.get(union.size()-1)!=arr1[j]){
                    union.add(arr1[j]);}

                    j++;

            }
            for(int val:union){
                System.out.print(val+" ");
            }
        }
        public static void main(String args[]){
            int arr[]={1,2,3,4,5};
            int arr1[]={2,3,4,5,6};
            UnionOptimal(arr,arr1);
            Union(arr,arr1);


        }
    }

package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (i!=j&&arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(arr[i]);
                return;
            }
        }

    }
}



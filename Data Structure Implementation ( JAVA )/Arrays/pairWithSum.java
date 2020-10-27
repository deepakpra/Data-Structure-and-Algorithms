import java.util.HashSet;

class pairWithSum {
    public static void main(String[] args) {
        int arr[] = {1,3,5,3,7,9};
        int sum =10;
        System.out.println(solve(arr, sum));

    }

    // static boolean solve(int arr[], int sum) {
    //     HashSet<Integer> map = new HashSet<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         map.add(arr[i]);
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         if(map.contains(sum-arr[i])) {
    //             return true;
    //         }
    //     }

    static boolean solve(int arr[], int sum){
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(hash.contains(sum-arr[i])) {
                return true;
            }
            hash.add(arr[i]);
        }
        return false;
    }
 
}
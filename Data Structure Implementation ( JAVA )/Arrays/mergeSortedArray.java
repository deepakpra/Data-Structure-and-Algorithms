public class mergeSortedArray {
   public static void main(String[] args) {
       int arr1[] = {4,8,15,20};
       int arr2[] = {2,4,6,8};
       int arr3[] = solve(arr1, arr2);
       for (int i : arr3) {
           System.out.print(i+" ");
       }
   } 

   static int[] solve(int arr1[], int arr2[]) {
        int n1 = arr1.length; 
        int n2 = arr2.length;
        int arr3[] = new int[n1+n2];
        int i=0,j=0,k=0;

         // Traverse both array 
        while(i<n1 && j<n2) {

            // Check if current element of first 
            // array is smaller than current element 
            // of second array. If yes, store first 
            // array element and increment first array 
            // index. Otherwise do same with second array 
            if(arr1[i]<arr2[j]) {
                arr3[k++] =arr1[i];
                i++;
            } else {
                arr3[k++] =arr2[j];
                j++;
            }
        }

          // Store remaining elements of first array
        while(i<n1) {
            arr3[k++] = arr1[i];
            i++;
        }

          // Store remaining elements of second array
        while(j<n2) {
            arr3[k++] =arr2[j];
            j++;
        }
       

        return arr3;

   }
}
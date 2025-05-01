public class MergeSortedArray{
    

    public static void main(String[] args) {
        
        int [] nums1 = { 1 , 2 , 3 , 0 , 0 , 0};
        int [] nums2 = { 2 , 5 , 6};
          int m = 3;
         int n = 3;
    
       
         merge1(nums1, m, nums2, n);
         printArray(nums1);

        
    }
public static void merge(int [] nums1, int m , int[] nums2 , int n){
       
        int i = m - 1;
        int j = n - 1;

        int k = m + n -1;

        while( j >= 0){
           
            if( nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
            
        // while( j >=0){
        //     nums1[k--] = nums2[j--];
        // }

    }


    public static void merge1(int [] nums1, int m , int[] nums2 , int n){
        
        int i = 0;
        int j = 0;
          int k = 0;
     
          int [] arr = new int[m+n];

          while( i < m && j < n){
            if(nums1[i] <nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
          }
    // 
          while( i < m){
            arr[k++] = nums1[i++];
          }
            while( j < n){
                arr[k++] = nums2[j++];
            }

            for( int l =0; l < arr.length; l++){
                nums1[l]  = arr[l];
            }


    }





    public static void printArray(int [] arr){
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
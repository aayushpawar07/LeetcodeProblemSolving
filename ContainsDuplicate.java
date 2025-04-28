
import java.util.Arrays;


public class ContainsDuplicate {
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        // HashSet<Integer> set = new HashSet<>();

        // for( int num : nums){
        //     if( set.contains(num)){
        //         System.out.println("true");
        //         return;
        //     }
        //     set.add(num);
        // }

  
        Arrays.sort(nums);

        for( int i  = 0; i < nums.length; i++){
          
            if(nums[i] == nums[i+1]){
                System.out.println("true");
                return;
            }
        }


   
        System.out.println("false");
        
    }
}

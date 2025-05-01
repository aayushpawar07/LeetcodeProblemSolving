// 
// import java.awt.font.NumericShaper;
import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args) {
         
        int []  nums = { 2  , 5 , 7 , 11 , 15};
     
         int k = 7;
        // for( int i = 0; i < arr.length; i++ ){
        //     for(  int j = i+1;  j < arr.length; j++){

        //         if( arr[i] + arr[j] == k){
        //             System.out.println("true");
        //            System.out.println(i +" "+ j); 
        //             return;
        //         }
        //     }
        // }

        HashMap<Integer , Integer> map = new HashMap<>();
    
        for( int i = 0;  i < nums.length; i++){
            
            int diff =  k - nums[i];

            if(map.containsKey(diff)){

                System.out.println("True");
                System.out.println(map.get(diff) + "" + i);
            }
        
            map.put(nums[i] , i);

        }



 System.out.println("not Present");

}

}

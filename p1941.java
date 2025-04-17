import java.util.HashMap;

public class p1941{

    public static void main(String[]args){
      
        String s = "abacbc";
     
        
        // areOccurrencesEqual(s);
 System.out.println(areOccurrencesEqual(s));



    }

    public static  boolean areOccurrencesEqual(String s){
      
        // int [] count = new int[26];

        // for(int i : s.toCharArray()){
        //     count[i - 'a']++;
        // }
        
        // int freq = 0;
         
        // for( int i : count){

        //     if( freq == 0 && i != 0){
        //         freq = i;
        //     }
        //     else if( i != 0 && i != freq){
        //         return false;
        //     }
        // }

        
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0 )+1);
        }
     
        int freq = map.get(s.charAt(0));


        for( int i : map.values()){
          
            if( i != freq){
                return false;
            }

        }





 return true;


    } 




  


}
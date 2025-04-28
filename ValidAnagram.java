public class ValidAnagram {
    
    
    public static void main(String[] args) {
         
        String s = "anagram";
        String t = "nagaram";
        
      boolean res =   isAnagram(s, t);

        System.out.println(res);
        
        // System.out.println(isAnagram(s, t));
        

    }

    public static  boolean isAnagram( String s1 , String s2){

  
        if( s1.length() != s2.length()){
            return false;
        }

        int [] charArray = new int[26];

        for( int i = 0;  i < s1.length();  i++){
             
            charArray[s1.charAt(i) - 'a']++;
             
            charArray[s2.charAt(i) - 'a']--;
        }

        for( int num : charArray){
            if(num != 0){
                return false;
            }
        }

        return true;


    }
}

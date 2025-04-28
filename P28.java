public class P28 {
 
    public static void main(String[] args) {
    
        String haystack = "sadbutsad";

        String needle = "sd";

        System.out.println(strstr(haystack, needle));

  
    }
    public static int strstr(String haystack , String needle){
     
        // return haystack.indexOf(needle);
        int m = haystack.length();
        int n = needle.length();

        for(int i = 0; i < m -n; i++){
          
            if(haystack.substring( i , i+n).equals(needle)){
                return i;
            }
            
        }

return -1;

    }
    
  
}

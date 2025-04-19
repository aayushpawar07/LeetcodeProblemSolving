










public class p1961 {
 

    public static void main(String[] args) {
        
        String words[] = {"I", "am", "a", "programmer"};
        
        String s = "Iama";

        System.out.println(isprefixString(s, words));
    }

    public static boolean  isprefixString(String s , String words[]){
     
     
        int n = s.length();

        StringBuilder sb = new StringBuilder();
 
//         for(String word : words){
//             sb.append(word);
        
     
//         if(sb.toString().equals(s)){
            
//     return true;
// }
// if(sb.length()> n){
//     return false;
// }
//         }

// return false;


for( String word : words){
  
    sb.append(word);
 
    if(sb.length() >= n){
        break;
    }




}

return sb.toString().equals(s);
    





}

    


}

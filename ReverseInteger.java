public class ReverseInteger {
   
    public static void main(String[]args){

        int x = 12345;
        
        if( x < 0){
            System.out.println("Negative number not allowed");
            return;
        }
            
        int rev = 0;

        while( x !=0){
            int digit = x % 10;

            if( rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)){
                System.out.println("Overflow");
                return;
            }
                

            rev = rev * 10 + digit;
            x = x / 10;
        }

        System.out.println(rev);
        // return 0;
    }
}

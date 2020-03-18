import java.util.*;
class substring{
    static Scanner scn = new Scanner(System.in);

    public static int pallindrome(String str){
        int i = 0;
        int j = str.length()-1;
        int count = 0;
        while(i<=j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1 != ch2){
                count = 0;
                break;
            }else{
                i++;
                j--;
                count++;
            }
        }
        return count ;
    }

    public static void check(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            String ans = "";
            char ch = str.charAt(i);
            ans = ans + ch;
            int myans = pallindrome(ans);
            if(myans>0){
                count ++;
                System.out.println(ans);
            }
            for(int j=i+1; j<str.length(); j++){
                char ch1 = str.charAt(j);
                ans = ans + ch1;
                int myans2 = pallindrome(ans);
                if(myans2>0){
                    count ++;
                    System.out.println(ans);
                }
            }
        
    }
        System.out.print(count);
    }
    public static void main(String []args){
        String str = scn.next();
        check(str);
    }
}
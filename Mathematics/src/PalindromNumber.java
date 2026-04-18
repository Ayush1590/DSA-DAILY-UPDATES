public class PalindromNumber {
    //a  number is palindrome number if the number value is same if we reverse the number
    public static void main(String[] args){
        int i=6776;
        int rev=0;
        int temp=i;
        while(temp>0){
            int rm=temp%10;
            rev=rev*10+rm;
            temp=temp/10;
        }
        if(rev==i){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}

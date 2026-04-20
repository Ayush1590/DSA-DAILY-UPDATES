public class LongestSparseNumber {
    public static void main(String[] args) {
        int n=5;
        int rs=longestConsecutive1(n);
        if(rs==1){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
    public static int longestConsecutive1(int n) {
        int count=0;
        while(n>0){
            n=n&(n<<1);
            count++;
        }
        return count;
    }
}

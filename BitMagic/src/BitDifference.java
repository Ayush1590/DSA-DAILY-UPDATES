public class BitDifference {
    //You are given two numbers a and b. The task is to count the number of bits needed to be flipped to convert a to b.
    //Note : flipping of bit means inverting its value -- changing 1 to 0 and 0 to 1
    public static void main(String[] args) {
    int a = 10, b = 20;
        System.out.println(countBitsFlip(a,b));
    }
    public static int countBitsFlip(int a, int b){

        int count=0;
        int c=a^b;
        while(c>0){
            if((c&1)!=0){
                count++;
            }
            c=c>>1;
        }
        return count;
    }
}

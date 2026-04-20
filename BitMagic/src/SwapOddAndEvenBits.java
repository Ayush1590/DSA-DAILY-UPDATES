public class SwapOddAndEvenBits {
    //Given an unsigned integer n, You have  to swap all even-position bits with their rightside adjacent odd-position bits.
    public static void main(String[] args) {
        int n=23;
        int ob=0x55555555;
        int eb=0xAAAAAAAA;
        int o= n &ob;
        int e=n &eb;
        e>>=1;
        o<<=1;
        System.out.println(e|o);
    }
}

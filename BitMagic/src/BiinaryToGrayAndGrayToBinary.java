public class BiinaryToGrayAndGrayToBinary {
    public static void main(String[] args) {
        System.out.println(greyConverter(7));
        int n=0;
        System.out.println(grayToBinary(n));
    }
    public static int greyConverter(int n) {

        return n^(n>>1);

    }
    public static int grayToBinary(int n)
    {

        int ans= 0;
        while(n>0)
        {
            ans = ans ^ n;
            n = n>>1;
        }
        return ans;

    }
}

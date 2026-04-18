public class powerOfANumber {
    public static void main(String[] args) {
        int n= power(5,6);
        System.out.println(n);
    }
    static int power(int x, int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }
}

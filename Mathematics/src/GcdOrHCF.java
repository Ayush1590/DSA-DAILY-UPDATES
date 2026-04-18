public class GcdOrHCF {
    // a number is called gcd when the highest common factor divides both number
    // so we start with samllest of 2 numbers and go below from there as the samllest may be the factor of large as well as small num
    //The idea of this algorithm is, the GCD of two numbers doesn’t change if the smaller number is subtracted from the bigger number. This is the Euclidean algorithm by subtraction. It is a process of repeat subtraction, carrying the result forward each time until the result is equal to any one number being subtracted.
    public static void main(String[] args) {
        int i1=12;
        int i2=15;
        int i=gcd(i1,i2);
        System.out.println(i);
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

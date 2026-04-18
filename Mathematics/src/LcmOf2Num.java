public class LcmOf2Num {
    //a x b = LCM(a, b) * GCD (a, b)
    public static void main(String[] args) {
        int i=10,i2=22;
        int gcd=GcdOrHCF.gcd(i,i2);
        int lcm=(i*i2)/gcd;
        System.out.println("The lcm of "+i+" and "+i2+" is "+lcm);
    }
}

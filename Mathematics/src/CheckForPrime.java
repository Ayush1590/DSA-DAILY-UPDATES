public class CheckForPrime {
    public static void main(String[] args) {
        int i=7;
        boolean res=Prime(i);
        System.out.println(res);
    }
    public static boolean Prime(int n){
        if(n%2==0) return false;
        if(n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}

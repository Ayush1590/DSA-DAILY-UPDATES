public class CheckKthBitIsSet {
    public static void main(String[] args) {
        int n=5,k=1;
        kthBitSet(n,k);
    }
    public static void kthBitSet(int n,int k){
        if(n==0){
            System.out.println("NOT SET");
        }
        int x=1<<(k-1);
        if((n&x)!=0){
            System.out.println("SET");
        }
        else
            {
                System.out.println("NOT SET");
            }
    }
}

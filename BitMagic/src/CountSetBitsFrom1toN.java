public class CountSetBitsFrom1toN {
    public static void main(String[] args) {
        int upto=17,total=0;

        for(int j=1;j<=upto;j++){
            int res=CountSetBitsFrom1toN(j);
            total+=res;
        }
        System.out.println(total);
    }
    public static int CountSetBitsFrom1toN(int n){
        int result=0;
        while(n>0){
            n=n&(n-1);
            result++;
        }
        return result;
    }
}

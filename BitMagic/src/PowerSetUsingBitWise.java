public class PowerSetUsingBitWise {
    public static void main(String[] args) {
        String s="abcd";
        int n=s.length();
        int pSetLen=1<<n;
        for(int i=0;i<pSetLen;i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    System.out.print(s.charAt(j)+" ");
                }
            }
            System.out.println();
        }
    }
}

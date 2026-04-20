public class RightMostDifferentBit {
   //Given two integers m and n , return the position (1-based from the right) of the rightmost bit where they differ in binary, or -1 if both are identical.
    public static void main(String[] args) {
        int res=1,m=29,n=15;
        if(m==n){
            System.out.println(-1);
        }
        int k=m^n;
        while(k>0){
            if((k&1)!=0){
                System.out.println(res);
                break;
            }
            res++;
            k=k>>1;
        }

    }
}

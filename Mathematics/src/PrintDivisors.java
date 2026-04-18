public class PrintDivisors {
    //dovisors mean like lets say 10 so 2*5 1*10
    public static void main(String[] args) {
        int i=15;
        int j;
        for(j=1;j*j<i;j++){
            if(i%j==0){
                System.out.print(j+" ");
            }
        }
        for(;j>=1;j--){
            if(i%j==0){
                System.out.print(i/j+" ");
            }
        }
    }
}

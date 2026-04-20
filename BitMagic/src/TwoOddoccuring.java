public class TwoOddoccuring {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,4,4,6};
        int x=arr[0];
        for(int i=1;i<arr.length;i++){
            x^=arr[i];
        }
        int k=x&(~(x-1));
        int n1=0,n2=0;
        for(int i=0;i<arr.length;i++){
            if(((arr[i]&k)!=0)){
                n1^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        System.out.println(n1+" "+n2);
    }
}

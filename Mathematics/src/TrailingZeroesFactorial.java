import java.io.BufferedReader;
import java.io.InputStreamReader;
//Trailing zeroes in a factorial states the number of zeroes at end of a factorial result of a nuyber
// 5 fact 120 = 1 zero
//Concept follows that the number of combination of prime factor 5*2 leads to 10 or 0 at end and since 5 occurs most number of times
//we can say the number of 5's is the  number of zeroes
//lower subs of n/5 + n/25 + n/125 ...
public class TrailingZeroesFactorial {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter a number");
            String num=br.readLine();
            int i=Integer.parseInt(num);
            int res=0;
            for(int j=5;j<i;j*=5){
                int temp=i/j;
                res=res+temp;
            }
            System.out.println("The trailing 0's in factorial of "+i+" is "+res);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

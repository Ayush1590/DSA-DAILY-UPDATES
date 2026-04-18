import java.io.BufferedReader;
import java.io.InputStreamReader;
//5 factorial
//5*4*3*2
public class FactorialOfaNumber {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter a number");
            String num=br.readLine();
            int i=Integer.parseInt(num);
            int res=fact(i);
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static int fact(int n){
        if(n==1){return 1;}
        return n*fact(n-1);
    }
}

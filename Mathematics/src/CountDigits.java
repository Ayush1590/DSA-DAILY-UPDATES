
import java.io.*;
public class CountDigits {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        System.out.println("Enter a number");
        try{
            String i=br.readLine();
            System.out.println(i+" length is "+i.length());
            int num=Integer.parseInt(i);
            while(num>0){
                num=num/10;
                count++;
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(count);
    }
}

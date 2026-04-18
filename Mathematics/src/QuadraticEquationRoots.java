public class QuadraticEquationRoots {
    //ax^2+bx+c roots of equation for a=1,b=-7 and c=12 is 4 adn 3
    // Drives on formulla
    //D=b^2-4ac
    //x=(-b+-sqrt(d))/2a
    public static void main(String[] args) {
        printRoots(1,-7,12);
    }
    public static void printRoots(int a, int b, int c)
    {
        int D=(b*b)-(4*a*c);
        if(D<0){
            System.out.println("-1");
        }
        else{
            int R1= (-(b)+(int)Math.sqrt(D))/(2*a);
            int R2= (-(b)-(int)Math.sqrt(D))/(2*a);
            System.out.println(R1);
            System.out.println(R2);
        }
    }
}

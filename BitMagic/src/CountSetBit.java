public class CountSetBit {
    static int []table = new int[256];
    public static void main(String[] args) {
        int x=12;
//        int result=0;
//        while(x>0){
//            x=x&(x-1);
//            result=result+1;
//        }
//        System.out.println(result);
        initTable();
        System.out.println(table[x & 0xff]+table[(x>>8)&0xff]+table[(x>>16)&0xff]+table[(x>>24)]);
    }
    public static void initTable()
    {
        table[0]=0;
        for(int i=0;i<256;i++)
        {
            table[i]=(i&1)+table[i/2];
        }
    }
}

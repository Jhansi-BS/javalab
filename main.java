package prgm9;

public class main {
    public static void main(String[] args) {
        fixed f=new fixed(10);
        dynamicstack d=new dynamicstack(11);
        Isimplestack istack;
        istack=f;
        System.out.println("content of fixed stack");
        for(int i=0;i<10;i++)
        {
        istack.push((char)('A'+i));
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(f.pop()+"\t");
        }
        System.out.println("\ncontent of dynamic stack");
        for(int i=0;i<10;i++)
        {
        istack.push((char)('A'+i));
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(f.pop()+"\t");
        }
    }
    
}

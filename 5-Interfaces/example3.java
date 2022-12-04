
interface Test3
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test3
{
    void meth4();
}

class My1 implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}


public class example3 
 {
    public static void main(String[] args) 
    {
        System.out.println(Test3.X);
        Test3.meth3();
        
    }
 }

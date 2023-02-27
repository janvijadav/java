public class localInner1
{
    private int data = 30;
    void disp()
    {
        class local_j
        {
            void msg()
            {
                System.out.println(data);
            }
        }
        local_j l = new local_j();
        l.msg();
    }
    public static void main(String[] args) {
        localInner1 obj = new localInner1();
        obj.disp();
    }
}

//O/P:- 30
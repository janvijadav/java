//java nested interface

interface test
{
    void show();
    interface Message
    {
        void msg();
    }
}

class nes_int implements test.Message
{
    public void msg()
    {
        System.out.println("Hello Nested Interface..");
    }
    public static void main(String[] args) {
        test.Message message = new nes_int();
        message.msg();
    }
}

//O/P:-  Hello Nested Interface..
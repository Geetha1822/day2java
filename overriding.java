class user{
    void name()
    {
        System.out.println("Function 1");
    }
}
class user1 extends user{
    void name()
    {
        System.out.println("Funtion 2");
    }

}
class Main{
    public static void main(String[] args){
        user us=new user();
        us.name();
        user1 us1=new user1();
        us1.name();
    }
}
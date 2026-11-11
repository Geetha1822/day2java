class student{
    private int id;

    void getter(){
        System.out.println(id);
    }
    void setter(int num){
        id=num;
    }
}
class Main{
    public static void main(String[] args){
        student std=new student();
        std.setter(203049);
        std.getter();

    }
}
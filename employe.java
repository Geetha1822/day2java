import java.util.Scanner;
class employee{
    String name;
    int id;
    double salary;
    void getter()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
    void setter(String n,int i,double s)
    {
        name=n;
        id=i;
        salary=s;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        employee e=new employee();
        System.out.println("enter a name:");
        String a=sc.nextLine();
        System.out.println("enter id:");
        int b=sc.nextInt();
        System.out.println("enter salary:");
        double c=sc.nextDouble();
        e.setter(a,b,c);
        e.getter();

    }
}
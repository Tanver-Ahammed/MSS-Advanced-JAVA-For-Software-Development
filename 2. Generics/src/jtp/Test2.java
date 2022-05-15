package jtp;

public class Test2<T,U> {
    T obj1;
    U obj2;

    public Test2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    private void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        Test2<Integer,String>obj = new Test2<>(125,"Tanver");

        obj.print();
    }
}

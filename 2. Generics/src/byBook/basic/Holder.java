package byBook.basic;

public class Holder {
    private Object object;

    public Object getObject() {
        return object;
    }

    public Holder setObject(Object object) {
        this.object = object;
        return this;
    }

    public static void main(String[] args) {
        Holder stringHolder = new Holder();
        stringHolder.setObject("Hello World");
        System.out.println(stringHolder.getObject());

        Holder integerHolder = new Holder();
        integerHolder.setObject(25);
        System.out.println(integerHolder.getObject());

        // now we can cast it

        Integer object = (Integer) integerHolder.getObject();
        if (object instanceof Integer) {
            Integer sum=0;
            sum = object+5;
            System.out.println(sum);

        }

        System.out.println(stringHolder.getObject() instanceof Integer);



    }
}

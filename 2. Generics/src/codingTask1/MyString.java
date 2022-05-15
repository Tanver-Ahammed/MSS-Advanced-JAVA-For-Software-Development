package codingTask1;

class MyString implements Appendable<MyString> {

    @Override
    public Appendable<MyString> append(MyString a) {
        this.append(a);
        return this;
    }
}
package byOracle;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new OrderedPair<>("Key",120);
        System.out.println(pair1.getKey()+"\t"+pair1.getValue());

        Pair<String,String> pair2= new OrderedPair<>("Key","Value");
        System.out.println(pair2.getKey()+"\t"+pair2.getValue());


        Pair<Double,Float> pair3 = new OrderedPair<>(12.25,12.36f);
        System.out.println(pair3.getKey()+"\t"+pair3.getValue());
    }
}

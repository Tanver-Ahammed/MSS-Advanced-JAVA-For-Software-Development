package interfaceDemo.lecture;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int randomNumber = new Random().nextInt(6)+1;
            System.out.println();
            switch (randomNumber) {
                case 1:{
                    Aeroplane aeroplane = new Aeroplane();
                    fly(aeroplane);
                    sell(aeroplane);
                    break;
                }
                case 2:{
                    Eagle eagle = new Eagle();
                    fly(eagle);
                    live(eagle);
                    break;
                }
                case 3:{
                    Mosquito mosquito = new Mosquito();
                    fly(mosquito);
                    live(mosquito);
                    break;
                }
                case 4:{
                    Rice rice = new Rice();
                    eat(rice);
                    sell(rice);
                    break;
                }
                case 5:{
                    Chicken chicken = new Chicken();
                    eat(chicken);
                    fly(chicken);
                    sell(chicken);
                    break;
                }
                case 6:{
                    Furniture furniture = new Furniture();
                    sell(furniture);
                    break;
                }
            }
        }
    }

    public static void fly(Flyable flyable){
        flyable.fly();
        System.out.println(flyable.getName());
    }

    public static void sell(Sellable sellable){
        System.out.println(sellable.getPrice());
    }

    public static void eat(Eatable eatable){
        System.out.println(eatable.getNutrition());
        System.out.println(eatable.getPrice());
    }

    public static void live(Lively lively){
        System.out.println(lively.livingYears());
    }

}

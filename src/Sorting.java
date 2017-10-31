/**
 * Created by Maria on 31.10.2017.
 */

import static java.util.Comparator.comparing;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList
                (new Apple(80, "green"),
                        new Apple(155, "green"),
                        new Apple(120, "red"),
                        new Apple(345, "yellow"),
                        new Apple(321, "red")
                ));
        int sum = 0;
        sum = inventory.stream()

                .filter(b -> b.getColor() == "red")
                .mapToInt(b -> b.getWeight())
//                .sum();
        .reduce(0, (a1, a2) -> a1 + a2);

        System.out.println("There are  " + sum + " grame");
    }
//        List<Apple> appleweight = filterApplesByWeight(inventory, 120);
//        System.out.println(appleweight);
//        List<Apple> applecolor = filterApplesByColor(inventory, "red");
//        System.out.println(applecolor);


    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){

        List<Apple> result = new ArrayList<>();

        for(Apple apple: inventory){
            if(apple.getWeight() > weight){
                result.add(apple);

            }
        }
        return result;
    }
    
    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}

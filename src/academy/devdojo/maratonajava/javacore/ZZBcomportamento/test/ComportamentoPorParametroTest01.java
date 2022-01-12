package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("blue", 2020), new Car("red", 2021), new Car("black", 2022));

    public static void main(String[] args) {
        System.out.println(filterBlueCar(cars));
    }

    private static List<Car> filterBlueCar(List<Car> cars) {
        List<Car> blueCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("blue")) {
                blueCars.add(car);
            }
        }
        return blueCars;
    }
}







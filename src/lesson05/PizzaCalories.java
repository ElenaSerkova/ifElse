package lesson05;
//Напишите программу, которая вычисляет, сколько лишних калорий будет,
//если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
//Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
public class PizzaCalories {
    public double caloriesInPizza(double diameter, double caloriesInOneCm){
        double squarePizza = Math.PI * (diameter / 2) * (diameter / 2);
        double totalCalories = caloriesInOneCm * squarePizza;
        return totalCalories;
    }

}

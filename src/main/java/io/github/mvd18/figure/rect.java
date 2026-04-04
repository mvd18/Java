package io.github.mvd18.figure;

import io.github.mvd18.task11b.Figure;

public class rect {
    public static void main(String[] args) {
        System.out.println(" Использование библиотеки");

        Figure fig = new Figure(10.0, 5.0, "blue");
        System.out.println("Создана фигура: " + fig);
        System.out.println("Площадь: " + fig.getArea());
        System.out.println("Периметр: " + fig.getPerimeter());

        System.out.println("\n Готово!");
    }
}

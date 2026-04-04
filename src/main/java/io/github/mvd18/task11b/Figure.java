//package - пакет +- библиотека
//io.github.mvd18.task11b - имя библиотеки, в которой находится этот проект
package io.github.mvd18.task11b;

/**
 * Класс представляет геометрическую фигуру - прямоугольник
 *
 * @author mvd18
 * @version 1.0
 */
public class Figure {

    // Поля класса (атрибуты)
    private double width;      // ширина фигуры
    private double height;     // высота фигуры
    private String color;      // цвет фигуры
    private String name;       // название фигуры

    /**
     * Конструктор по умолчанию
     * Создает фигуру с размерами 1x1 и цветом "white"
     */
    public Figure() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "white";
        this.name = "Rectangle";
    }

    /**
     * Конструктор с параметрами
     *
     * @param width  ширина фигуры (должна быть > 0)
     * @param height высота фигуры (должна быть > 0)
     * @param color  цвет фигуры
     * @throws IllegalArgumentException если ширина или высота <= 0
     */
    public Figure(double width, double height, String color) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "Ширина и высота должны быть положительными числами!"
            );
        }
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = "Rectangle";
    }

    /**
     * Конструктор с названием фигуры
     *
     * @param width  ширина
     * @param height высота
     * @param color  цвет
     * @param name   название фигуры
     */
    public Figure(double width, double height, String color, String name) {
        this(width, height, color);
        this.name = name;
    }

    // Методы доступа (геттеры)

    /**
     * Получить ширину фигуры
     * @return ширина фигуры
     */
    public double getWidth() {
        return width;
    }

    /**
     * Получить высоту фигуры
     * @return высота фигуры
     */
    public double getHeight() {
        return height;
    }

    /**
     * Получить цвет фигуры
     * @return цвет фигуры
     */
    public String getColor() {
        return color;
    }

    /**
     * Получить название фигуры
     * @return название фигуры
     */
    public String getName() {
        return name;
    }

    // Методы изменения (сеттеры)

    /**
     * Установить ширину фигуры
     * @param width новая ширина (должна быть > 0)
     * @throws IllegalArgumentException если ширина <= 0
     */
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина должна быть > 0");
        }
        this.width = width;
    }

    /**
     * Установить высоту фигуры
     * @param height новая высота (должна быть > 0)
     * @throws IllegalArgumentException если высота <= 0
     */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Высота должна быть > 0");
        }
        this.height = height;
    }

    /**
     * Установить цвет фигуры
     * @param color новый цвет
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Установить название фигуры
     * @param name новое название
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Вычислить площадь фигуры
     * @return площадь прямоугольника (ширина × высота)
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Вычислить периметр фигуры
     * @return периметр прямоугольника (2 × (ширина + высота))
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    /**
     * Переопределение метода toString()
     * @return строковое представление фигуры
     */
    @Override
    public String toString() {
        return String.format(
                "%s [%.2f x %.2f, color=%s, area=%.2f, perimeter=%.2f]",
                name, width, height, color, getArea(), getPerimeter()
        );
    }
}

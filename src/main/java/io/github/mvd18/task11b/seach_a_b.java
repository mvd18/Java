//package - пакет +- библиотека
//io.github.mvd18.task11b - имя библиотеки, в которой находится этот проект
package io.github.mvd18.task11b;

//модуль с вычислениями
public class seach_a_b {

    /**
     * @brief функция для вычисления а, по заданным x, y, z
     * @param x
     * @param y
     * @param z
     * @return
     */
    //public - означает, что доступно из всех модулей
    //static - означает, что эту функцию можно вызывать не создавая переменную типа seach_a_b
    public static double val_a(double x, double y, double z ){

        double a = (3 + Math.exp(y-1))/( 1 + x * x * Math.abs(y - Math.tan(z)));

        return a;
    }

    /**
     * @brief функция для вычисления b, по заданным x, y
     * @param x
     * @param y
     * @return
     */
    public static double val_b(double x, double y){

        double b = 1 + Math.abs(y-x) + (y-x)*(y-x)/2 + Math.pow(Math.abs(y-x), 3)/3;

        return b;
    }
}

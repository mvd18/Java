package io.github.mvd18.task11b;
import io.github.mvd18.task11b.Figure;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class WindTask11Controller {

    //переменные для вычисления а, b
    public TextField in_y;
    public TextField in_z;
    public TextField in_x;

    //многострочное поле вывода
    public TextArea text_area_report;

    //обработчик события для кнопки
    public void calc_ab(MouseEvent mouseEvent){

        double x = 0.0, y = 0.0, z = 0.0;

        double a = 0.0, b = 0.0;

        // считывание данных из полей ввода
        String x_text = in_x.getText();
        String y_text = in_y.getText();
        String z_text = in_z.getText();

        //isEmpty() метод, который проверяет, пустая ли строка
        if (x_text.isEmpty() || y_text.isEmpty() || z_text.isEmpty()) {
            text_area_report.appendText("Заполните все поля!\n");
            return;
        }


        //try-catch — это механизм обработки исключений.
        //он позволяет перехватить ошибку во время выполнения программы и корректно на неё отреагировать
        try {
            // преобразование текста в числа
            x = Double.parseDouble( x_text );
            y = Double.parseDouble( y_text );
            z = Double.parseDouble( z_text );
            //NumberFormatException - это исключение, которое возникает,
            //когда вы пытаетесь преобразовать строку в число, но строка не содержит корректного числового значения.
        } catch (NumberFormatException e) {
            text_area_report.appendText("Введите числовые значения!\n");
            return; // Прерываем выполнение, если ввод некорректен
        }

        // <название класса>.<функция для вычислений>
        a = seach_a_b.val_a(x, y, z);
        b = seach_a_b.val_b(x, y);

        // добавление текста в многострочное поле вывода
        text_area_report.appendText(
                String.format("x = %.2f; y = %.2f; z = %.2f;\na = %.2f; b = %.2f \n", x, y, z, a, b)
        );


    }

    //обработчик события для кнопки
    public void figure_report(MouseEvent mouseEvent) {
        Figure check = new Figure(4.5, 3.2, "green");
        text_area_report.appendText(
                "Figure\n" +
                        "Ширина: " + check.getWidth() + "\n" +
                        "Высота: " + check.getHeight() + "\n" +
                        "Цвет: " + check.getColor() + "\n" +
                        "Площадь: " + check.getArea() + "\n" +
                        "Периметр: " + check.getPerimeter() + "\n\n"
        );
    }

}

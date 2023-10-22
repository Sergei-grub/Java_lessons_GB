package OOP_Homework.Task_7_Attestation.Model;

import java.util.Scanner;

public class Complex {
    double real; // Действительная часть Комплексного числа
    double image; // Мнимая часть Комплексного числа


    public Complex() {// Конструктор принимает данные и передает
        Scanner input = new Scanner(System.in);
        System.out.print("\nДействительная часть -> ");
        this.real = input.nextDouble();
        System.out.print("Мнимая часть -> ");
        this.image = input.nextDouble();

    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }
}

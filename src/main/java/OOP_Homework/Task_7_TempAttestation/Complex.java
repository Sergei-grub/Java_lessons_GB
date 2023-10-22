package OOP_Homework.Task_7_TempAttestation;

import java.util.Scanner;

public class Complex {

    double real; // Действительная часть Комплексного числа
    double image; // Мнимая часть Комплексного числа

    Complex() {// Конструктор принимает данные и передает
        Scanner input = new Scanner(System.in);
        double real = input.nextDouble();
        double image = input.nextDouble();
        ComplexM(real, image);
    }

    private void ComplexM(double real, double image) {// для конструкторов без аргументов
        // TODO Auto-generated method stub
        this.real = real;
        this.image = image;
    }

    Complex(double real, double image) {// конструктор с параметрами
        this.real = real;
        this.image = image;
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

    Complex add(Complex a) {// Добавить комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex sub(Complex a) {// Вычитаем комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex mul(Complex a) {// умножить комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real * real2 - image * image2;
        double newImage = image * real2 + real * image2;
        Complex result = new Complex(newReal, newImage);
        return result;
    }

    Complex div(Complex a) {// Делим комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image * real2 - real * image2) / (real2 * real2 + image2 * image2);
        Complex result = new Complex(newReal, newImage);
        return (result);
    }

    public void print() {// вывод
        if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else if (image < 0) {
            System.out.println(real + "" + image + "i");
        } else {
            System.out.println(real);
        }
    }


}

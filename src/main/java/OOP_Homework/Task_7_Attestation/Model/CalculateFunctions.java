package OOP_Homework.Task_7_Attestation.Model;

import OOP_Homework.Task_7_Attestation.View.PrintOperation;

import java.io.IOException;

public class CalculateFunctions {


    //Расчеты +, -, *, /
    public void sumFunction(Complex n1, Complex n2) throws IOException {
        double newReal = n1.getReal() + n2.getReal();
        double newImage = n1.getImage() + n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void diffFunction(Complex n1, Complex n2) throws IOException {
        double newReal = n1.getReal() - n2.getReal();
        double newImage = n1.getImage() - n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void mulFunction(Complex n1, Complex n2) throws IOException {
        double newReal = n1.getReal() * n2.getReal() - n1.getImage() * n2.getImage();
        double newImage = n1.getImage() * n2.getReal() + n1.getReal() * n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void divFunction(Complex n1, Complex n2) throws IOException {
        double newReal = (n1.getReal() * n2.getReal() + n1.getImage() * n2.getImage()) / (n2.getReal() * n2.getReal() + n2.getImage() * n2.getImage());
        double newImage = (n1.getImage() * n2.getReal() - n1.getReal() * n2.getImage()) / (n2.getReal() * n2.getReal() + n2.getImage() * n2.getImage());
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }


}

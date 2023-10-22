package OOP_Homework.Task_7_Attestation.Model;

import OOP_Homework.Task_7_Attestation.View.PrintOperation;

public class CalculateFunctions {


    public void sumFunction(Complex n1, Complex n2) {
        double newReal = n1.getReal() + n2.getReal();
        double newImage = n1.getImage() + n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void diffFunction(Complex n1, Complex n2) {
        double newReal = n1.getReal() - n2.getReal();
        double newImage = n1.getImage() - n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void mulFunction(Complex n1, Complex n2) {
        double newReal = n1.getReal() * n2.getReal() - n1.getImage() * n2.getImage();
        double newImage = n1.getImage() * n2.getReal() + n1.getReal() * n2.getImage();
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }

    public void divFunction(Complex n1, Complex n2) {
        double newReal = (n1.getReal() * n2.getReal() + n1.getImage() * n2.getImage()) / (n2.getReal() * n2.getReal() + n2.getImage() * n2.getImage());
        double newImage = (n1.getImage() * n2.getReal() - n1.getReal() * n2.getImage()) / (n2.getReal() * n2.getReal() + n2.getImage() * n2.getImage());
        PrintOperation toConsole = new PrintOperation();
        toConsole.pOperation(newReal, newImage);
    }


}

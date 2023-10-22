package OOP_Homework.Task_7_Attestation.View;

import OOP_Homework.Task_7_Attestation.Controller.SelectOperation;


public class PrintOperation {
    public void pOperation(Double real, Double image){
        SelectOperation start = new SelectOperation();
        System.out.print("\nРезультат: ");
        if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else if (image < 0) {
            System.out.println(real + "" + image + "i");
        } else {
            System.out.println(real);
        }

//        start.calc();
    }
}

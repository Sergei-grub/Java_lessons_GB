package OOP_Homework.Task_7_TempAttestation;

public class MainClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("\n*_*_* Калькулятора комплексных чисел *_*_*\n");
        System.out.println ("Введите действительные и мнимые части ПЕРВОГО комплексного числа: ");
//        Complex data1 = new Complex(2, 3);
        Complex data1 = new Complex();
        System.out.println ("Введите действительные и мнимые части ВТОРОГО комплексного числа: ");
//        Complex data2 = new Complex(5, 7);
        Complex data2 = new Complex();

        // Ниже приведены сложение, вычитание, умножение и деление
        Complex result_add = data1.add(data2);
        Complex result_sub = data1.sub(data2);
        Complex result_mul = data1.mul(data2);
        Complex result_div = data1.div(data2);

        result_add.print();
        result_sub.print();
        result_mul.print();
        result_div.print();
    }


}

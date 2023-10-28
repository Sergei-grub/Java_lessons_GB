package Exception_Seminars.Ex_Seminar_2.task1;

public class MyArrayDataException extends CustomArrayException {

    /**
     *
     * @param message // Сообщение ---
     * @param x // Индекс внешнего массива
     * @param y // Индекс внутреннего массива
     */
    public MyArrayDataException(String message, int x, int y) {
        super(message, x, y);
    }

    /**
     *
     * @param message // Сообщение ---
     * @param throwable // Стек вызываемых методов
     * @param x // Индекс внешнего массива
     * @param y // Индекс внутреннего массива
     */
    public MyArrayDataException(String message, Throwable throwable, int x, int y) {
        super(message, throwable, x, y);
    }
}

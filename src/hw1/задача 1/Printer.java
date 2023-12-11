class Answer {
    public static void arrayOutOfBoundsException() {
        throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
    }
    public static void divisionByZero() {
        throw new ArithmeticException("Деление на ноль");
    }
    public static void numberFormatException() {
        throw new NumberFormatException("Ошибка преобразования строки в число");
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try { 
            int[] arr = new int[5];
            arr[5] = 10; // выход за пределы массива
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            int x = 1 / 0; // деление на 0
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            int y = Integer.parseInt("abc"); // ошибка преобразования строки в число
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
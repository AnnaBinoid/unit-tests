package seminars.third.hw;

public class Number {

    public static boolean evenOddNumber(int n){
        return n % 2 == 0;
    }

    /**
     *Разработайте и протестируйте метод numberInInterval,
     * который проверяет, попадает ли переданное число в интервал (25;100).
     * (код приложен в презентации)
     */

    public static boolean numberInInterval(int n){
        return 25 <= n && n <= 100;
    }
}

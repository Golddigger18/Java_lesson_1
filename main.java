public class main {
    public static void main(String[] args) { //String - массив строк, args -аргументы запуска программы
        int i = 1;
        long l = 2L; //неявные преобразование, если l = 2, то программа преобразует l в int, L - 2 сразу типа long
        double d = 3.5d; //d-аналогично L
        boolean b;

        b = true; //присвоение
        i ++; //унарная операция
        i = i +1; //бинарная операция
        b = i > 5; //сравнение

        System.out.println("i = " + i); //Вывод на экран
    }
}

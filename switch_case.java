public class switch_case {
    public static void main(String[] args){
        int mark = 2;

        switch(mark){
            case 5:
                System.out.println("Отлично");
                break; //Для выхода из switch_case всегда необходимо делать break, так как он пойдет дальше, если его не поставить
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Что то пошло не так!");
                break;
        }
    }
}

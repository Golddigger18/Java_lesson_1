public class while_ {
    public static void main(String[] args){
        int a = 1;

        do{
            System.out.println("do-while: a = "+ ++a); //гарантирует, что хотяб 1 раз блок цикла будет выполнен
        } while (a<0);//цикл с постусловием

        while (a>0){
            System.out.println("while: a = "+ a--);//цикл с предусловием
        }
    }
}

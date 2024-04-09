package sample3;

public final class Logical3 {

    public static void main(String[] args) {
        int score1;
        score1 = 59;
        
        System.out.print("score1が40以上、かつ50以下 ： ");
        System.out.println(score1 >= 40 && score1 <= 50);
        
        System.out.print("score1が40以上、または50以下 ： ");
        System.out.println(score1 >= 40 || score1 <=50);
        
        System.out.print("score1が60以上ではない ： ");
        System.out.println(!(score1 >= 60));

    }

}

package sample3;

public class SwitchSample3 {

    public static void main(String[] args) {
        int score1 = 77;
        
        switch (score1 /10) {
            case 10 -> System.out.println("満点です！");
            case 9,8 -> System.out.println("花丸です！");
            case 7,6 -> System.out.println("合格です");
            default -> System.out.println("赤点です。。。");
            
        }

    }

}

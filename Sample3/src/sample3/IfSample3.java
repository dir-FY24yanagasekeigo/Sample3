package sample3;

public class IfSample3 {

    public static void main(String[] args) {
        int score1;
        score1 = 79;
        
        if(score1 >= 100) {
            System.out.println("満点です！");
        
        } else if (score1 >= 80){
            System.out.println("花丸です！");
            
        } else if(score1 >= 60) {
            System.out.print("合格です！");
            
        } else {
            System.out.println("赤点です。。。");
        }

    }

}

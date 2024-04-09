package sample3;

public class MethodSample3 {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 25;
        
        sumMethod1(num1, num2);
        
        int result2 = summethod2(num1, num2);
        System.out.println("sumMethod2の結果は" + result2);

    }
    
    public static void sumMethod1(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("sumMethod1の結果は" + result);
    }
    
    public static int summethod2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

}

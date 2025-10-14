/**
 * ClassName:MathDemo
 * Description:
 */
public class MathDemo {
    public static final double PI = 3.1415926;
    public static char randomUpperCaseChar(){
        return (char)(Math.random() * 26 + 'A');
    }
    public static double sqrt(double a){
        double error = 1e-5;
        double root0 = 1.0;
        double root1 = 1.0/2*(root0+a/root0);
        while (Math.abs(root1-root0)>=error){
            root0 = root1;
            root1 = 1.0/2*(root0+a/root0);
        }
        return root1;
    }
    public static double cos(int degree){
        double x = Math.PI/180*degree;
        double result = 1.0;
        int flag = -1;
        for (int n = 2;n<=20;n+=2){
            result += flag*Math.pow(x,n)/factorial(n);
            flag = -flag;
        }
        return result;
    }
    public static int factorial(int num){
        int result = 1;
        for (int i = 1;i<=num;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MathDemo.cos(60));
    }
}

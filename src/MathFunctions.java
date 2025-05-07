public class MathFunctions {


    public int add(int a, int b){
        return a+b;
    }


    public double add(double c, double d){
        return c+d;
    }


    public int sub(int a, int b){
        return a-b;
    }


    public double sub(double a, double b) {
        return a-b;
    }


    public int multiply(int a, int b){
        return a * b;
    }


    public double multiply(double a, double b){
        return a * b;
    }


    public int div(int a, int b){
        return a / b;
    }


    public double div(double a, double b){
        return a / b;
    }


    public int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }


    public double abs(double a){
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }


    public int pow(int a){
        return a * a;
    }


    public double pow(double a){
        return a * a;
    }



}

public class Main {
    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();

        System.out.println(math.add(1,2));
        System.out.println(math.add(1.2,2.1));
        System.out.println(math.sub(5,5));
        System.out.println(math.sub(6.28,3.14));
        System.out.println(math.multiply(2,2));
        System.out.println(math.multiply(2.2,2.2));
        System.out.println(math.div(5,1));
        System.out.println(math.div(5.6,1.2));
        System.out.println(math.abs(-2));
        System.out.println(math.abs(-2.3));
        System.out.println(math.pow(2));
        System.out.println(math.pow(2.2));
    }
}

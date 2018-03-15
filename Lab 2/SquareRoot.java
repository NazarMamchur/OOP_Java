public class SquareRoot {

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 999999999;

        double sqDisc = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        if (a == 0 && b == 0 && c == 0){
            System.out.println("x1=\nx2=");
            return;
        }
        if (a == 0 && b == 0 && c != 0){
            System.out.println("x1=\nx2=");
            return;
        }
        if (a == 0 && c != 0){
            System.out.println("x1=" + -c / b + "\nx2=" + -c / b);
            return;
        }
        if (a == 0 && c == 0 && b != 0){
            System.out.println("x1=0.0\nx2=0.0");
            return;
        }
        if (Math.pow(b, 2) - 4 * a * c < 0){
            System.out.println("x1= \nx2=");
            return;
        }
        if (Math.pow(b, 2) == 4 * a * c){
            System.out.println("x1=" + (-b / (2 * a)) + "\nx2=" + (-b / (2 * a)));
            return;
        }
        double x1 =  (-b + sqDisc) / (2 * a);
        double x2 =  (-b - sqDisc) / (2 * a);
        System.out.println("x1=" + x1 + "\nx2=" + x2);
    }
}

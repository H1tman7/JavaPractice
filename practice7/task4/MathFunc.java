package practice7.task4;
import static java.lang.Math.*;
public class MathFunc implements MathCalculable{
    private double x, y, angle;

    MathFunc(double X, double Y){
        x = X;
        y = Y;
        angle = atan2(y, x);
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double absComplex() {
        return sqrt(x*x + y+y);
    }

    @Override
    public void powComplex(int k) {
        double absPow = pow(absComplex(), k);
        double re = cos(k * angle);
        double im = sin(k * angle);
        setX(absPow * re);
        setY(absPow * im);
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        if (y > 0)
            return "Комплексное число: " + x + " + " + y + "i";
        else if (y < 0)
            return "Комплексное число: " + x + " " + y + "i";
        else return "Комплексное число: " + x;
    }
}
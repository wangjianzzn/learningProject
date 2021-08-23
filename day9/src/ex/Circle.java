package ex;

public class Circle extends Shape {
    double r;
    @Override
    public double getArea(){
        return Math.PI*this.r*this.r;

    }
}

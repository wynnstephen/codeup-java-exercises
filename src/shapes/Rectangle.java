package shapes;

public class Rectangle extends Quadrilateral {



    public Rectangle(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {

        this.length = side;

    }

    @Override
    public void setWidth(double side) {

        this.width = side;

    }

}
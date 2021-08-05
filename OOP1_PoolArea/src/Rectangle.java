public class Rectangle {
    private double width = 0.0;
    private double length = 0.0;

    public Rectangle(double width, double length){
        super();
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        if(width<0)
            width = 0.0;
        else
            width = width;
        return width;
    }

    public double getLength() {
        if(length<0)
            length = 0.0;
        else
            length = length;
        return length;
    }

    public double getArea() {
        return (length * width);
    }
}


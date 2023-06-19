package corejava5;

public class Rectangle extends Figure {
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    // @Override
    double area(){
        System.out.println("Area of Rectangle: ");
        return dim1 *dim2;
    }
}

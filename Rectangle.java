/***
    Classe Rectangle :
        - longueur > height
        - largeur > width

    - getters/setters
    - perimeter
    - area -> surface
*/

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double widthV, double heightV){
        this.width = widthV;
        this.height = heightV;
    }

    public double perimeter(){
        double calculPerimeter = ((this.height + this.width)*2);
        return calculPerimeter;

    }
    
    public double area(){
        double calculArea = (this.height * this.width);
        return calculArea;
        
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

}


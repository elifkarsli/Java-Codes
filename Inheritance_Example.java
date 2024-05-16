package Less_Code_More_Work;

public class Inheritance_Example {
    public static void main (String[]args){
        Rectangle r1 = new Rectangle(10,20 );  
        r1.printProperty();
    }
}

class geometricShape{
    private int height;
    private int width;

    public geometricShape(int height,int width){
        this.height=height;
        this.width=width;
    }

    public geometricShape(){}

    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }

    public void Area(){
        System.out.println("The area is : " + height*width);
    }

    public void Environment(){
        System.out.println("The environment is : " + (height+width)*2 );
    }
}

class Rectangle extends geometricShape{
    public Rectangle(int height,int width){
        setHeight(height);
        setWidth(width);
    }

    public void printProperty(){
        System.out.println("This geometric shapes width : " + getWidth() + "height : " + getHeight());
        Area();
        Environment();
    }
}
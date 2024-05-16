package Less_Code_More_Work;

public class Composion {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.move();
        mycar.stop();
    }
}

class Engine{
    private String name;
    private int power;

    public Engine(){
        name = "Porsche";
        power = 150;
    }

    public void work(){
        System.out.println("Engine is stopped");
    }

    public void close(){
        System.out.println("Engine is closed");
    }
}

class Car{
    private Engine carEngine;
    private String color;
    private String brande;
    private int year;

    public Car(){
        carEngine = new Engine();
        color = "red";
        brande = "lamborghini";
        year = 2024;
        System.out.println(color + brande + year);
    }

    public void move(){
        System.out.println("The car is moving"); 
    }

    public void stop(){
        System.out.println("The car is stopped");
    }

}

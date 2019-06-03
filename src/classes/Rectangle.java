package classes;

public class Rectangle{
    int length;
    int breadth;

    // Constructor
    public Rectangle(int x, int y){
        this.length = x;
        this.breadth = y;
    }

    // Funtion to find area
    public int area(){
        return (this.length*this.breadth);
    }
}
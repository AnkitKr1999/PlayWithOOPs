package abstraction;

public class Abstraction {
    public static void main(String[] args){
        BMW car1 = new BMW(4000,"SUV","GLS160");
        car1.showType();
        car1.start();
    }
}
class BMW extends Car{
    String model;
    public BMW(int price, String type, String model){
        super(price,type);
        this.model = model;
    }
    void start(){
        System.out.println(this.model + " is starting.");
    }
}
abstract class Car{
    int price;
    String type;
    public Car(int price,String type){
        this.price=price;
        this.type=type;
    }
    // this is a concrete function/method
    void showType(){
        System.out.println("This is a " + this.type);
    }
    abstract void start();
}

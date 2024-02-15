public class MainClass {

    public static void main(String[] args)
    {
        Person p1 = new Person("Ankit",24);
        Developer d1 = new Developer("Kumar", 24);
        d1.walk();
        System.out.println(Person.personCount);
    }
}

class Developer extends Person{
    public Developer(String name,int age){
        super(name,age);
    }
    // Run time polymorphism
    public void walk(){
        System.out.println("Developer " + this.name + " is walking");
    }

}

class Person{
    String name;
    int age;
    static int personCount;
    public Person(){
        personCount++;
        System.out.println("Object is being instantiated");
    }
    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age){
        this();
        // this(name);
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println(this.name + " is walking");
    }
    // Compile time polymorphism
    protected void walk(int steps){
        System.out.println(this.name + " is walking " + steps + " steps");
    }
}
package OOPHomeWork;

public class Cat extends Animal{
    private boolean hasTail;

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Cat(String breed, String sex, float weight, int name,
               byte age, String color, String address, boolean hasTail) {
        super(breed, sex, weight, name, age, color, address);
        setHasTail(hasTail);
    }
    public void Meow(){
        System.out.println(super.getName() + " is Meow");


    }
    public void Scratch(){
        System.out.println("Sometimes " + super.getName() + " is scratching");
    }
}

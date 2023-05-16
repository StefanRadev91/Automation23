package OOPHomeWork;

public class Dog extends Animal{
    private boolean hasTail;

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Dog(String breed, String sex, float weight, int name, byte age, String color, String address,boolean hasTail) {
        super(breed, sex, weight, name, age, color, address);
        setHasTail(hasTail);
    }

    @Override
    public void licking() {
        ////super.licking();
        System.out.println(super.getName() + " is licking when he drinks water");
    }
}

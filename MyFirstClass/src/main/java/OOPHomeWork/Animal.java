package OOPHomeWork;

public class Animal implements AnimalActions{

    private String breed;
    private String sex;
    private float weight;
    private int name;
    private byte age;
    private String color;
    private String address;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public float setWeight(float weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid value of weight");
        }
        return weight;
    }


    public int getName() {
        return name;
    }

    public void setName(int name) {
        if (name >= 100) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Animal(String breed, String sex, float weight, int name, byte age, String color, String address) {
        setBreed(breed);
        setSex(sex);
        setWeight(weight);
        setName(name);
        setAge(age);
        setColor(color);
        setAddress(address);
    }

    @Override
    public void purring() {
        System.out.println(this.name + "is purring");

    }

    @Override
    public void licking() {
        System.out.println(this.name + " is licking himself as a method of cleaning");

    }
}


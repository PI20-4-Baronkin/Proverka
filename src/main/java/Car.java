public class Car {
    private String name;

    private int age;

    private float weigh;

    private float height;

    public Car(String name, int age, float weigh, float height) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeigh(float weigh) {
        this.weigh = weigh;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void Person(String name,
                       int age,
                       float weigh,
                       float height) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.height = height;
    }

    public class Worker extends Person{

    }

}

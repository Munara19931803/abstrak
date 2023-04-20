public class Horse extends Animal {
    private String color;

    public Horse(String nickName, int age, int weight, String gender, String color) {
        super(nickName, age, weight, gender);
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println(nickName + " is running");
    }

    @Override
    public void eat() {
        System.out.println(nickName + " is eating");
    }

    @Override
    public void walk() {
        System.out.println(nickName + " is walking");
    }
}

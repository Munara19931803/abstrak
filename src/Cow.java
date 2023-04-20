public class Cow extends Animal {

    public Cow(String nickName, int age, int weight, String gender) {
        super(nickName, age, weight, gender);
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

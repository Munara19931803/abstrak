public abstract class Animal {
    public String nickName;
    private int age;
    private int weight;
    private String gender;

    public abstract void run();

    public abstract void eat();

    public abstract void walk();

    public Animal(String nickName, int age, int weight, String gender) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}


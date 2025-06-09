public class Z1Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void getDetails(String name){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


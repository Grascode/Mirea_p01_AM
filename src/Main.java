//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main cat = new Main("Oleg", 12);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        getInfo();
    }
    public static void getInfo(){
        System.out.println(123);
    }

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
package hong.pojo;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 21:32
 */
public class User {
    private String name;
    private int age ;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public User() {
        System.out.println("无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

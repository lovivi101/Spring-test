/**
 * @description:
 * @author: hjx
 * @time: 2021年04月06日 15:09
 */
public class hello {
    private String name ;
    private int age ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "hello{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package po;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/18/ 11:14
 * @Description:
 * @GitHup: 957kk
 */
public class Person {
    private String name;
    private String id;
    private String sex;
    private String age;

    public Person() {
    }

    public Person(String name, String id, String sex, String age) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

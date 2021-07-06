package dao;

import po.Person;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/18/ 11:18
 * @Description:
 * @GitHup: 957kk
 */
public class PersonDao {
    private static Person[] person = new Person[5];

    public boolean add(Person per) {
        System.out.println(person.hashCode());
        int index = -1;
        for (int i = 0; i < person.length; i++) {
            Person person1 = person[i];
            //非空判断，防止出现空指针异常
            if (person1 == null) {
                index = i;
                break;
            }
        }
        // 3. 返回是否添加成功的boolean类型状态
        if (index == -1) {
            // 装满了
            return false;
        } else {
            // 没有装满, 正常添加, 返回true
            person[index] = per;
            return true;
        }
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < person.length; i++) {
            Person per = person[i];
            if (per != null && per.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    public Person[] findAllPerson() {
        return person;
    }

    public void delete(String id) {
        int index = getIndex(id);
        if (index != -1) {
            person[index] = null;
        }

    }

    public void update(String id, Person per) {
        int index=getIndex(id);
        person[index]=per;

    }


    public Person[] select() {
        return person;
    }
}

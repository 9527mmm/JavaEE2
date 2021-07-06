package controller;

import po.Person;
import service.PersonService;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/18/ 11:17
 * @Description:
 * @GitHup: 957kk
 */
public class PersonController {
    private PersonService personService = new PersonService();
    private Scanner sc = new Scanner(System.in);

    public void add() {
        String id;
        while (true) {
            System.out.println("请输入id");
            id = sc.next();
            boolean flag = personService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("性别");
        String sex = sc.next();
        System.out.println("年龄");
        String age = sc.next();
        Person person = new Person();
        person.setId(id);
        person.setAge(age);
        person.setName(name);
        person.setSex(sex);

        boolean result = personService.add(person);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }


    }

    public void delete() {
        String id;
        while (true){
            System.out.println("请输入id");
            id= sc.next();
            boolean exists=personService.isExists(id);
            if (!exists) {
                System.out.println("不存在，请重新输入");
            } else {
                break;
            }
        }
        personService.delete(id);
        System.out.println("删除成功");
    }

    public void update() {
        String id;
        while (true){
            System.out.println("请输入id");
            id= sc.next();
            boolean exists=personService.isExists(id);
            if (!exists) {
                System.out.println("不存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String sex = sc.next();
        Person person = new Person();
        person.setSex(sex);
        person.setName(name);
        person.setAge(age);
        person.setId(id);

        personService.update(id,person);

    }

    public void select() {

        Person[] per=personService.select();

        for (int i = 0; i < per.length; i++) {
            Person perr=per[i];
            if(perr!=null){
                System.out.println(perr.getSex()+perr.getId()+perr.getAge()+perr.getName());
            }

        }
    }
}

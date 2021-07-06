package entry;

import controller.PersonController;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/18/ 11:17
 * @Description:
 * @GitHup: 957kk
 */
public class ManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎~~~~~~");
        PersonController personController = new PersonController();
       lo: while (true) {
            System.out.println("1，增 2，删 3，改 4，查 5，退出");
            String chioce = sc.next();
            switch (chioce) {
                case "1":
                    personController.add();
                    break;
                case "2":
                    personController.delete();
                    break;
                case "3":
                    personController.update();
                    break;
                case "4":
                    personController.select();
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    break lo;
                default:
                    System.out.println("输入错误，请重输");
            }
        }

    }
}

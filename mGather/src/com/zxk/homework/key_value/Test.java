package com.zxk.homework.key_value;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 18:26
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,Object> map=new HashMap<>(16);
        map.put("name","张三");
        map.put("sex","男");
        map.put("age",22);
        map.put("high",170);
        map.put("money",88888);
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println("键"+stringObjectEntry.getKey()+"---值"+stringObjectEntry.getValue());
        }
    }
}

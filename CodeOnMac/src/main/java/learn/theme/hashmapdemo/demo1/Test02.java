package main.java.learn.theme.hashmapdemo.demo1;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        /* 初始化哈希表 */
        Map<Integer, String> map = new HashMap<>();

        /* 添加操作 */
// 在哈希表中添加键值对 (key, value)
        map.put(12836, "小哈");
        map.put(15937, "小啰");
        map.put(16750, "小算");
        map.put(13276, "小法");
        map.put(10583, "小鸭");

        /* 遍历哈希表 */
// 遍历键值对 key->value
        for (Map.Entry <Integer, String> kv: map.entrySet()) {
            System.out.println(kv.getKey() + " -> " + kv.getValue());
        }
// 单独遍历键 key
        for (int key: map.keySet()) {
            System.out.println(key);
        }
// 单独遍历值 value
        for (String val: map.values()) {
            System.out.println(val);
        }

    }
}

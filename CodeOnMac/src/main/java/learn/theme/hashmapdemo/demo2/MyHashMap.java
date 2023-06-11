package main.java.learn.theme.hashmapdemo.demo2;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    //内部列表存储键值对
    private List<Entry> bucket;

    /*初始化列表*/
    public MyHashMap() {
        bucket = new ArrayList<>();
        //创建一百个键值对
        for (int i = 0; i < 100; i++) {
            bucket.add(null);
        }
    }

    /*哈希函数*/
    public int hashFunc(int key) {
        return key % 100; //返回 0-100 的 索引值
    }

    /*根据索引值查询*/
    public String get(int key) {
        Entry pair = bucket.get(hashFunc(key));
        if (pair == null) {
            return null;
        }
        return pair.getValue();
    }

    /*添加键值*/
    public void put(int key, String value) {
        //创建键值
        Entry pair = new Entry(key, value);
        //获取索引添加到数组
        int index = hashFunc(key);
        bucket.set(index, pair);
    }

    /*删除操作*/
    public void remove(int key) {
        bucket.set(hashFunc(key), null);//置空即为删除
    }

    /*获取所有键值对*/
    public List<Entry> entrySet() {
        List<Entry> entryList = new ArrayList<>();
        //遍历 bucket 如果不为空就添加到 entrySet 中
        for (Entry pair : bucket) {
            if (pair != null) {
                entryList.add(pair);
            }
        }
        return entryList;
    }

    /*获取所有键*/
    public List<Integer> keySet() {
        List<Integer> keyList = new ArrayList<>();
        //遍历 bucket 如果不为空就添加到 entrySet 中
        for (Entry pair : bucket) {
            if (pair != null) {
                keyList.add(pair.getKey());
            }
        }
        return keyList;
    }

    /*获取所有值*/
    public List<String> valueSet() {
        List<String> valueList = new ArrayList<>();
        //遍历 bucket 如果不为空就添加到 entrySet 中
        for (Entry pair : bucket) {
            if (pair != null) {
                valueList.add(pair.getValue());
            }
        }
        return valueList;
    }
}

package java_1031;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-31
 * Time:10:25
 **/
public class TestMap {

    public static void main(String[] args) {
        //1、创建map,map有两个参数，第一个是key的类型，第二个是value的类型
        //创建map的目的就是通过key找到对应的value

        Map<String,String> map = new HashMap<>();
//2、size( )计算键值对的个数
        System.out.println(map.size());

        //3、查看map是否为空
        System.out.println(map.isEmpty());
        //4、向map中插入键值对
        map.put("及时雨","宋江");
        map.put("智多星","吴用");
        map.put("行者","武松");
        map.put("玉麒麟","卢俊义");
        map.put("入云龙","公孙胜");
        //5、get( )通过key找val
        System.out.println(map.get("及时雨"));
        //找不到则返回Null
        System.out.println(map.get("嘻嘻嘻"));
        //找不到返回默认值
        System.out.println(map.getOrDefault("蔡文姬", "奶妈"));

        //6、通过containsKey和containsValue来判断某个值是否存在
        System.out.println(map.containsKey("智多星"));
        System.out.println(map.containsValue("吴用"));
        //7、使用foreach循环来遍历map中的元素
        //Map.Entry表示集合中的某一个键值对   map.entrySet表示Map中所有的键值对
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}

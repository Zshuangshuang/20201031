package java_1031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-31
 * Time:10:04
 **/
public class TestCollection {


    public static void main(String[] args) {
        //1、创建collection
        Collection<String> collection = new ArrayList<>();
        //2、size( ) 求collection的大小
        System.out.println(collection.size());
        //3、isEmpty( )判断collection是否为空
        System.out.println(collection.isEmpty());
        //4、add( ) 默认是尾插
        collection.add("张三");
        collection.add("爱");
        collection.add("李四");
        //5、toArray可以把collection转化为数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));
        //使用for循环打印
        for (String s:collection) {
            System.out.print(s+" ");
        }

    }
}

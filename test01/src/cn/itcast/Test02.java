package cn.itcast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("zhangsan");
        arrayList.add("zhangli");
        arrayList.add("lisi");
        arrayList.add("waqngwu");
        arrayList.add("zhangli");
        arrayList.add("waqngwu");
//        arrayList.removeIf(s ->
//                s.length() == 4
//        );

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if("zhangli".equals(s)){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}

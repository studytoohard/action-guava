package cn.hannahl.action.guava.collect;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapsAction {

    public static void newHashMapWithExpectedSize() {
        HashMap<String, String> map = Maps.<String, String>newHashMapWithExpectedSize(7);
        System.out.println(map);
    }

    public static void main(String[] args) {
        MapsAction.newHashMapWithExpectedSize();
    }

}

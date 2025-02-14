package com.patternStruct.xianyuan;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    public static Map<String, AbstractBox> map;

    private static BoxFactory boxFactory = new BoxFactory();

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
    }

    public AbstractBox getBox(String shape) {
        return map.get(shape);
    }

    public static BoxFactory getInstance() {
        return boxFactory;
    }
}

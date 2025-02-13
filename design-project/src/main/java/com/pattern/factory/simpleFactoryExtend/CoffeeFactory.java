package com.pattern.factory.simpleFactoryExtend;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CoffeeFactory {
    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            for (Object object : properties.keySet()) {
                String key = (String) object;
                String value = properties.getProperty(key);
                map.put(key, (Coffee) Class.forName(value).newInstance());
            }
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String type) {
        return map.get(type);
    }
}

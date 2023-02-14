package br.com.pedrocorra.crudusersmysql.util;

import java.lang.reflect.Field;

public class ObjectUtils {

    public ObjectUtils(){

    }

    public static boolean isAnyFieldEmpty(Object obj) throws IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value = field.get(obj);
            if (value == null || value.equals("")) {
                return true;
            }

        }
        return false;
    }
}

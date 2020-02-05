package com.khanhhn.design_patterns.other_patterns.service_locator.example;

import com.khanhhn.design_patterns.other_patterns.service_locator.MessagingService;

public class InitialContext {

    public MessagingService lookup(String serviceName) {

        try {
            Class<MessagingService> clazz = (Class<MessagingService>) Class.forName(serviceName);
            Object newInstance = clazz.newInstance();

            return cast(newInstance, clazz);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> T cast(Object obj, Class<T> clazz) {
        if (clazz.isAssignableFrom(obj.getClass())) {
            return clazz.cast(obj);
        }
        throw new ClassCastException("Failed to cast instance.");
    }
}

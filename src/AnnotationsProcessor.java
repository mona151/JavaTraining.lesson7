import annotations.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class AnnotationsProcessor {

    public void process(Object object) throws IllegalAccessException {
        ReflectionProcessor reflectionChecker = new ReflectionProcessor();
        List<Field> fieldsList = new ArrayList<>();
        reflectionChecker.getAllClassFields(object, fieldsList);
        for (Field f : fieldsList) {
            if (f.isAnnotationPresent(FieldValueIsNotZero.class)) {
                f.setAccessible(true);
                Object value = f.get(object);
                if (value instanceof Number) {
                    Number numberValue = (Number) value;
                    if (numberValue.doubleValue() == 0) {
                        System.out.println("Value of " + object + " field" + f + " should not be equal to 0");
                    }

                }

            }

            if (f.isAnnotationPresent(RestrictedNumericValue.class)) {
                f.setAccessible(true);
                Object value = f.get(object);
                if (value instanceof Number) {
                    if ((float)value > 100) {
                        System.out.println("Value of " + object + " field:" + f + " should not be more than 100");
                    }

                }

            }
        }

        if (object.getClass().isAnnotationPresent(CheckClassModifier.class)) {
            if (Modifier.isFinal(reflectionChecker.getModifier(object))) {
                System.out.println("Class " + object + " is final");
            }
        }

    }

}

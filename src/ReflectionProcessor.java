import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ReflectionProcessor {

    public void getClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public List<Field> getAllClassFields(Object object, List<Field> fieldsList) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        fieldsList.addAll(Arrays.asList(fields));

        //Class superClass = clazz.getSuperclass();
        //getAllClassFields(superClass,fieldsList);

        Class superClass = clazz.getSuperclass();
        fieldsList.addAll(Arrays.asList(superClass.getDeclaredFields()));
        Class superSuperClass = superClass.getSuperclass();
        fieldsList.addAll(Arrays.asList(superSuperClass.getDeclaredFields()));

        return fieldsList;
    }

    public int getModifier(Object object) {
        Class clazz = object.getClass();

        int modifier = clazz.getModifiers();
        return modifier;
    }


}

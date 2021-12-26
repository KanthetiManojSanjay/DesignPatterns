package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author kansanja on 18/12/21.
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Resource res1 = Resource.getInstance();
        Resource res2 = Resource.getInstance();
        boolean bool = res1 == res2;
        System.out.println("Lazy singleton comparision :" + bool);

        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        boolean bool2 = es1 == es2;
        System.out.println("Eager singleton comparision :" + bool2);


        // Break singleton using Reflection
        Constructor constructor = Resource.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Resource res3 = (Resource) constructor.newInstance();
        boolean bool3 = res1 == res3;
        System.out.println("Reflection comparision :" + bool3);

        ResourceEnum resEnum1 = ResourceEnum.INSTANCE;
        ResourceEnum resEnum2 = ResourceEnum.INSTANCE;
        boolean bool4 = resEnum1 == resEnum2;
        System.out.println("Enum singleton comparision :" + bool4);
    }
}

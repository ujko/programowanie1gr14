package day6.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     // przedłużamy żywotność adnotacji
@Target(ElementType.METHOD)             // zawężamy do metod
public @interface RunIt {
    String name() default "defaultowy String";
}
package cn.jonathanwx.spring.enhance.jdbc.annotations;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lichangjiang
 * @date 2020-11-19 8:27
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface ImportTable {
    String value();

    String schema() default "";

    String alias() default "";
}

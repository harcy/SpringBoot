package com.sap.other;

import java.lang.annotation.*;

/**
 * Created by I337300 on 1/25/2017.
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Student {

    int Age() default 0;

    String Name() default "";

    String[] Email() default {};
}

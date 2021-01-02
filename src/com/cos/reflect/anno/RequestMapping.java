package com.cos.reflect.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//언제 동작할지 시점을 붙일 수 있음
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)//런타임때 어노테이션이 동작하게
public @interface RequestMapping {
	String value();
}

package com.volnoboy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 1/26/16 7:05 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PageUrl {

	String value();
}

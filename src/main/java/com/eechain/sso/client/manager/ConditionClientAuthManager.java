package com.eechain.sso.client.manager;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create by haloo on 2019-04-19
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ConditionalOnProperty(value = "sso.client.type", havingValue = "client")
@ConditionalOnBean(value = {OkRestTemplate.class, Generator.class})
public @interface ConditionClientAuthManager {
}

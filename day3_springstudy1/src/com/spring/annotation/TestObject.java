package com.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * Bean 的第二种配置形式： 基于注解的形式（基于注解配置Bean；基于注解来装配Bean的属性）
 * 特定组件包括:
 *	@Component: 基本注解, 标识了一个受 Spring 管理的组件
 *	@Respository: 标识持久层组件
 *	@Service: 标识服务层(业务层)组件
 *	@Controller: 标识表现层组件
 *	对于扫描到的组件, Spring 有默认的命名策略: 使用非限定类名,
 *	第一个字母小写. 也可以在注解中通过 value 属性值标识组件的名称
 * 
 * 
 */
@Component
public class TestObject {

}

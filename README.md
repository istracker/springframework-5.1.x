# 1. 从用入手 （怎么用？）
1. 引入依赖
2. 创建xml配置文件
3. 解析xml配置文件
4. 通过context容器取对象使用

<br>
<br>
<br>

# 过程
加载xml --> 解析xml文件 --> 封装BeanDefinition --> 实例化 --> 放到容器中 --> 从容器中获取

<br>
<br>
<br>
---
xml文件  —— 一堆字符串
BeanDefinition (对象定义信息)



<br>
<br>
<br>
---
## 容器：Map <key,value> <br>
<String, Object> <br>
<String, Class> <br>
<String, BeanFactory> <br>
<String, BeanDefinition> <br>
 
 三级缓存






<br>
<br>
<br>
<br>
---


---
反射 -- 
Spring Bean: singleton、prototype、request、session 

Spring 默认单例

---


# IOC 容器
创建和管理一系列Bean
> BeanFactory
> 整个容器的跟接口，也是容器的入口

## Bean的生命周期
### 1. Bean定义信息：xml、properties、yml、json. . . <br>
====解析处理环节====> 定义规范、方便拓展 BeanDefinitionReader
### 2. BeanDefinition

-------------------------- 拓展 -----------------------------------<br>
后置处理器（增强器PostProcessor）:
BeanFactoryPostProcessor      —— 增强BeanDefinition
BeanPostProcessor   —— 增强Bean信息

~~~ xml
<property name=url value=${jdbc.url}>
~~~ 
------------- 在容器创建过程中需要动态的改变Bean的信息怎么办 ---------------------


### 3.实例化
====反射====>
实例化 -- 在堆中开辟一块空间（对象的属性都是默认值）<br>
初始化 -- 给属性设置值{填充属性、执行初始化方法(init-method)} <br>
====创建对象====

<br>
<br>

### 4. 初始化
填充属性: populate <br>
设置Aware的属性<br>
BeanPostProcessor.before() ---- 拓展 AOP增强 <br>
执行init-method方法
BeanPostProcessor.after() ---- 拓展 AOP增强 <br>

=====> 完整对象

context.getBean()



## Aware接口
当Spring在创建Bean对象的具体过程中，如果需要容器的其他对象，此时可以将对象实现Aware接口


## SpringBean
容器对象 -- 相当于内置对象,Spring容器需要的对象<br>
普通对象 -- 相当于我们自己创建的对象<br>





## 接口
BeanFactory <br>
Aware <br>
BeanDefinition <br>
BeanDefinitionReader <br>
BeanDefinitionRegistry <br>
BeanFactoryPostProcessor <br>
BeanPostProcessor <br>
Environment --> StandardEnvironment <br>
FactoryBean <br>



## BeanFactory 和 FactoryBean的区别
相同点：都是用来创建对象 <br>

不同点：<br>
当使用BeanFactory的时候必须要遵循完整的创建过程，这个过程使用Spring管理控制的
当使用FactoryBean只需要调用getObject()就可以返回具体的对象，而整个对象创建过程都是由用户自己控制的，更加灵活（用来创建更加复杂的Bean）























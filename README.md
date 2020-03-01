# 设计模式

- 创建型模式
    - 单例模式、工厂模式、抽象工厂模式、建造者模式、原型模式
- 结构型模式
    - 适配器模式、桥接模式、装饰着模式、组合模式、外观模式、享元模式、代理模式
- 行为型模式

核心作用：保证只有一根对象，并且提供一个访问实例的全局访问点

- 优点

只生成一个实例，可以节约资源，访问速度快

## 单例模式  

- 主要
    
    - 懒汉和恶汉式

- 实现

懒汉式

```java
//1.创建一个句柄
public LanhanSingleton{
    private static LanhanSingleton instance=null;
    private LanhanSingleton(){}
    public static synchronized  LanhanSingleton getInstance() {
        //2.判断句柄是不是初始化
        if (instance == null) {
            //未初始化就进行初始化
            instance = new LanhanSingleton();
        }
        //返回对象
        return instance;
    }
}
```

饿汉式

```java
//饿汉式
public ESingleton{
    private static ESingleton instance=new ESingleton();
    private LanhanSingleton(){}
    public static synchronized  LanhanSingleton getInstance() {
        return instance;
    }
}

```
- 对比
    
    - 懒汉：不可以延迟加载，效率高
    
    - 饿汉式：延迟加载，效率不高

## 单例模式

###单例模式的比较以及选择

- 主要
    - 饿汉式：线程安全，调用效率高，但是不可以延迟加载
    - 懒汉式：线程安全，调用效率不高，但是可以延迟加载
- 其他
    - 双重检测锁：由于JVM和内部模型的原因，不建议使用
    - 静态内部类：具备了三种特点，调用效率高，延迟加载
    - 枚举式：调用效率高、不能延迟加载，可以天然防止反射和反序列化

-  选择

    - 单例对象  占用资源小，不需要延迟加载
    - 枚举好于恶汉
- 单例对象 占用资源大，需要延迟加载
    - 静态内部类类 好于 懒汉式
        
### 破解和测试

- 第一种方法使用的是反射

1.将文件的二进制流加入Class.forName(" ")然后获取到构造函数，然后创建对象的方法，使得最后又多个对象

** 注意：**在使用的过程中，为了防止被人构造函数创建对象，会将构造函数私有，
这里我们使用反射方法时候会出现问题，但是可以使用特权模式，

解决办法：可以在构造器中抛出异常的方式，第一次可以创建对象，第二次在调用就抛出异常。。

## 工厂模式

工厂模式完成创建者和调用者的分离,调用者创建，通过工厂进行分离。
    分类：简单工厂模式
          工厂方法模式
          抽象工厂模式
    设计原则
          关闭原则：对于扩展开放，对于修改关闭
          依赖关系：对于依赖，不直接的依赖，某一个类，而是依赖于一个接口
          达米特法则：尽量少的与类发生关系


### 简单工厂

在一个工厂方法中增加的时候，需要代码，这样违背了开闭原则,对修改关闭。

- 工厂方法模式的要点
    - 为了避免简单工厂的缺点，不完全满足开闭原则
    - 工厂方法模式和简单工厂模式 最大的不同在于，简单工厂只有一个工厂类，而工厂方法模式有一组实现了相同接口的工厂类，每次需要了就创建车，创建工厂。

## 抽象工厂

创建一个工厂，这个工厂是创建所有实例的。

### 结论：

我们一般都使用的是简单工厂模式



















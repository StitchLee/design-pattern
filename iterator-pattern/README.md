## 迭代器模式
迭代器模式(Iterator pattern) 提供一个迭代器，它可以按顺序遍历并访问容器中的元素，而无需暴露迭代器的内部实现。
迭代器模式如此常用，以至于Java标准库中，已经在各个容器类中集成了获取迭代器的方法，iterator()，我们使用List的时候根本无需自己去实现迭代器。

一般实现步骤如下：
- 定义一个容器类，添加一个可以获取Iterator的方法，比如iterator();
- 设计Iterator类, 封装遍历容器元素的算法；
- 客户端调用容器的iterator()方法获取该容器的迭代器iterator;
- 客户端使用itreator的first(), next(), hasNext()等方法访问元素。

Java中，已经给我们提供了一个迭代器的接口Iterator<E>， 通过实现它可以定义自己的迭代器； 
同时，Java提供了一个Iterable<T>接口，容器实现Iterable接口的iterator()方法可获取相应的迭代器。
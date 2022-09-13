## 备忘录模式（快照模式）
在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。 ----《大话设计模式》

使用步骤是：
- Originator: 发起人，负责创建一个Memento对象，以记录它当前的内部状态。Originator可以根据需要，决定Memento保存哪些内部状态；
- Memento：备忘录， 保存Originator的内部状态，并防止其它对象访问Originator的状态；
- Caretaker：管理者， 负责保存Memento对象列表，将Memento对象保存在一个聚合对象中，恢复时可以获取Memento。

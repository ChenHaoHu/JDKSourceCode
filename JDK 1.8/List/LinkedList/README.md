java.util 
类 LinkedList<E>
java.lang.Object
  继承者 java.util.AbstractCollection<E>
      继承者 java.util.AbstractList<E>
          继承者 java.util.AbstractSequentialList<E>
              继承者 java.util.LinkedList<E>
类型参数：
E - 在此 collection 中保持的元素的类型
所有已实现的接口： 
Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E>, Queue<E> 

--------------------------------------------------------------------------------

public class LinkedList<E>extends AbstractSequentialList<E>implements List<E>, Deque<E>, Cloneable, SerializableList 接口的链接列表实现。实现所有可选的列表操作，并且允许所有元素（包括 null）。除了实现 List 接口外，LinkedList 类还为在列表的开头及结尾 get、remove 和 insert 元素提供了统一的命名方法。这些操作允许将链接列表用作堆栈、队列或双端队列。

此类实现 Deque 接口，为 add、poll 提供先进先出队列操作，以及其他堆栈和双端队列操作。

所有操作都是按照双重链接列表的需要执行的。在列表中编索引的操作将从开头或结尾遍历列表（从靠近指定索引的一端）。


注意，此实现不是同步的。如果多个线程同时访问一个链接列表，而其中至少一个线程从结构上修改了该列表，则它必须 保持外部同步。（结构修改指添加或删除一个或多个元素的任何操作；仅设置元素的值不是结构修改。）这一般通过对自然封装该列表的对象进行同步操作来完成。如果不存在这样的对象，则应该使用 Collections.synchronizedList 方法来“包装”该列表。最好在创建时完成这一操作，以防止对列表进行意外的不同步访问，如下所示： 

   List list = Collections.synchronizedList(new LinkedList(...));此类的 iterator 和 listIterator 方法返回的迭代器是快速失败 的：在迭代器创建之后，如果从结构上对列表进行修改，除非通过迭代器自身的 remove 或 add 方法，其他任何时间任何方式的修改，迭代器都将抛出 ConcurrentModificationException。因此，面对并发的修改，迭代器很快就会完全失败，而不冒将来不确定的时间任意发生不确定行为的风险。 

注意，迭代器的快速失败行为不能得到保证，一般来说，存在不同步的并发修改时，不可能作出任何硬性保证。快速失败迭代器尽最大努力抛出 ConcurrentModificationException。因此，编写依赖于此异常的程序的方式是错误的，正确做法是：迭代器的快速失败行为应该仅用于检测程序错误。 

此类是 Java Collections Framework 的成员。 


package arrayDeque

fun main() {
    val deque = ArrayDeque<Int>()

    // as a queue, FIFO on both sides
    deque.addLast(1)
    deque.addLast(2)
    deque.addLast(3)
    println(deque) // [1, 2, 3]
    deque.removeFirst()
    deque.removeFirst()
    println(deque) // [3]

    // as a stack, LIFO on one side, i.e., the end
    deque.addLast(1)
    deque.addLast(2)
    println(deque) // [3, 1, 2]
    deque.removeLast()
    deque.removeLast()
    println(deque) // [3]
    // or LIFO on the other side, i.e., the start
    deque.addFirst(1)
    deque.addFirst(2)
    println(deque) // [2, 1, 3]
    deque.removeFirst()
    deque.removeFirst()
    println(deque) // [3]

}
/**
 * This class implements a stack data structure using a singly linked list.
 * It provides typical stack operations such as push, pop, peek, isEmpty, and size.
 * The stack follows the Last-In-First-Out (LIFO) principle.
 *
 * @param <T> the type of elements in this stack
 * 
 * @author Matthew Moga
 * @version April 26, 2024
 */

class DynamicStack<T> implements StackADT<T> {
    private LinkedList<T> myList;
    
    // Creates an empty stack (based on a linked list).
    public DynamicStack() {
        myList = new LinkedList<T>();
    }
    
    // Adds the specified element to the top of the stack
    public void push( T element ) {
        myList.addFirst( element );
    }
    
    // Removes the element from the top of the stack and returns a reference to it, or null (if empty).
    public T pop() {
        return myList.removeFirst(); 
    }
    
    // Returns a reference to the element at the top of the stack, or null (if empty).
    public T peek() {
        return myList.peekFirst();
    }
    
    // Returns true if the stack contains no elements, false otherwise.
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    
    // Returns the number of elements in the stack.
    public int size() {
        return myList.size();
    }
    
    // Clears all elements from the stack
    public void clear() {
        myList.clear();
    }
    
    // Returns a String representation of the stack.
    public String toString() {
        return myList.toString();
    }
}

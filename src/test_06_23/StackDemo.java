package test_06_23;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackDemo<E> {
	public static void main(String[] args) {
		StackDemo<String> st = new StackDemo<String>();
		st.push("a");
		System.out.println(st);
	}

	private Object[] elementData;
	private int size;
	private int modCount;
	private int elementCount;
	private int capacityIncrement;
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	private StackDemo() {
	}

	@SuppressWarnings({"UnusedReturnValue", "SameParameterValue"})
	private E push(E item) {
		addElement(item);

		return item;
	}

	@SuppressWarnings("WeakerAccess")
	public synchronized void addElement(E obj) {
		modCount++;
		ensureCapacityHelper(elementCount + 1);
		elementData[elementCount++] = obj;
	}

	private void ensureCapacityHelper(int minCapacity) {
		// overflow-conscious code
		if (minCapacity - elementData.length > 0)
			grow(minCapacity);
	}

	private synchronized void removeElementAt(int index) {
		modCount++;
		if (index >= elementCount) {
			throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
		} else if (index < 0) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int j = elementCount - index - 1;
		if (j > 0) {
			System.arraycopy(elementData, index + 1, elementData, index, j);
		}
		elementCount--;
		elementData[elementCount] = null; /* to let gc do its work */
	}

	public synchronized E pop() {
		E obj;
		int len = size();

		obj = peek();
		removeElementAt(len - 1);

		return obj;
	}

	private static int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) // overflow
			throw new OutOfMemoryError();
		return (minCapacity > MAX_ARRAY_SIZE) ? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
	}

	private void grow(int minCapacity) {
		// overflow-conscious code
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + ((capacityIncrement > 0) ? capacityIncrement : oldCapacity);
		if (newCapacity - minCapacity < 0)
			newCapacity = minCapacity;
		if (newCapacity - MAX_ARRAY_SIZE > 0)
			newCapacity = hugeCapacity(minCapacity);
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public boolean empty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

	public int search(Object o) {
		int i = lastIndexOf(o);

		if (i >= 0) {
			return size() - i;
		}
		return -1;
	}

	private int lastIndexOf(Object o) {
		if (o == null) {
			for (int i = size - 1; i >= 0; i--)
				if (elementData[i] == null)
					return i;
		} else {
			for (int i = size - 1; i >= 0; i--)
				if (o.equals(elementData[i]))
					return i;
		}
		return -1;
	}

	private synchronized E peek() {
		int len = size();

		if (len == 0)
			throw new EmptyStackException();
		return elementAt(len - 1);
	}

	@SuppressWarnings("InfiniteRecursion")
	private synchronized E elementAt(int index) {
		if (index >= elementCount) {
			throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
		}

		return elementAt(index);
	}

	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++)
				if (elementData[i] == null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(elementData[i]))
					return i;
		}
		return -1;
	}
}

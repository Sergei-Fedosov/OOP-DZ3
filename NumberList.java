import java.util.Iterator;

public class NumberList implements Iterable {

    private Element head;
    private Element tail;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {
            Element element0 = new Element("0");
            {
                element0.setNext(head);
            }
            Element currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public E next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }

    public int size() {
        return count;
    }

    private Element getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        Element result = head;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }
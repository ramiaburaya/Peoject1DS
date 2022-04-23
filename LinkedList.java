package application.projectds1;

public class LinkedList<T extends Comparable<T>> {
    private Node<T> head;

    public LinkedList () {

    }

    public LinkedList ( Node<T> head ) {
        this.head = head;
    }

    public void setHead ( Node<T> head ) {
        this.head = head;
    }

    public Node<T> getHead () {
        return head;
    }

    public void AddFirst ( T data ) {
        Node<T> newNode = new Node<>( data );
        if (head != null) {
            newNode.setNext( head );
        }
        head = newNode;
    }

    public void append ( T data ) {
        Node<T> newNode = new Node<>( data );
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext( newNode );
        }
    }

    public void travers () {
        System.out.print( "head --> " );
        Node<T> current = head;
        while (current != null) {
            System.out.print( current + " --> " );
            current = current.getNext();
        }
        System.out.print( "null" );
        System.out.println();

    }

    public void insert ( T data ) {

        Node<T> newNode = new Node<>( data );
        Node<T> prev = null;
        Node<T> curr = head;

        for (; curr != null && curr.getData().compareTo( data ) < 0; prev = curr, curr.setNext( curr.getNext() )) ;

        if (head == null) {
            head = curr;
        } else if (curr == head) {
            newNode.setNext( curr );
            head = newNode;
        } else {
            if (prev != null) {
                prev.setNext( newNode );
            }
            newNode.setNext( curr );
        }
    }


    public Node<T> search ( T data ) {
        Node<T> current = head;
        while (!(current == null) && !current.getData().equals( data )) {
            current = current.getNext();
        }
        return current;
    }


    public void deleteAtStart () {
        if (isEmpty()) {
            System.out.println( "The Linked List is empty!" );
        } else {
            head = head.getNext();
        }
    }

    public void delete ( T data ) {
        Node<T> current = head;
        Node<T> prev = null;
        if (isEmpty()) {
            System.out.println( "Error : List is Empty" );
        } else if (current.getNext() == null) { // if list has one item
            head = head.getNext();
        } else { // if list has multi items
            while (!current.getData().equals( data )) {
                prev = current;
                current = current.getNext();
            }
            if (prev != null) {
                prev.setNext( current.getNext() );
            }
        }
    }

    public void sort () {
        if (isEmpty()) {
            System.out.println( "List is Empty!" );
        } else {
            Node<T> current = head;
            Node<T> index;
            T temp;
            while (current != null) {
                index = current.getNext(); // using to get next Node (we use it in Compare)
                while (index != null) {
                    /* if first Node gather than next one , we save the value of first Node in temp
                       then we change the data in current (set in the data in index)
                       and finally we set the data in index (set it with data in temp(current))
                     */
                    if (current.getData().compareTo( index.getData() ) > 0) {
                        temp = current.getData();
                        current.setData( index.getData() );
                        index.setData( temp );
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }


    }

    public int length () {
        Node<T> current = head;
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            while (current != null) {
                count++;
                current = current.getNext();
            }
        }
        return count;
    }


    public boolean isEmpty () {
        return head == null;

    }


}


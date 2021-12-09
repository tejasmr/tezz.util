package tezz.util;

/**
 * Interface to define the standard operations on a group of similar items i.e., a collection.
 * @param <E> types of elements in this collection
 */
public interface Collection<E> {
    /**
     * To add an element to the collection.
     * @param e Element to add to the collection
     * @return whether the operation was successful
     */
    boolean add( E e );

    /**
     * To add the elements of another collection to this collection.
     * @param c Another collection
     * @return whether the operation was successful
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Removes all the elements from the collection.
     */
    void clear();

    /**
     * Checks if the collection contains the following element
     * @param e Element to check
     * @return whether the element exists in the collection
     */
    boolean contains(E e);

    /**
     * Checks whether the collection is empty
     * @return whether the collection is empty
     */
    boolean isEmpty();

    /**
     * To get the number of elements in the collection
     * @return number of elements in the collection
     */
    int size();

    /**
     * Remove the first instance of the element in the collection
     * @param e element to remove
     * @return whether the operation succeeded
     */
    boolean remove( E e );

    /**
     * To get the elements of the collection in array format.
     * @return elements of the collection in array format
     */
    E[] toArray();
}

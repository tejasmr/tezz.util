package tezz.util;

/**
 * Exception thrown when an operation is
 * being performed on an empty container
 */
public class NoElementException extends Exception {
    public NoElementException() {
        super("This container has no elements in it. Check if there are any values in it.");
    }
}

package org.olegus85.javainterview;

/**
 * @author d_shilko
 * Created: 27.05.2024
 */

public interface SortAlgorithm<T> {

    Generator<T> getGenerator();

    /**
     * @param unsorted array
     * @return sorted arrays (in natural order)
     */
    T[] sort(T[] unsorted);

}
package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;

public class BinarySearchLooslyCoupled {

    private final SortAlgorithm sortAlgorithm;

    public BinarySearchLooslyCoupled(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }
}

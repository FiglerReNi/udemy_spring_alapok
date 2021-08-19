package hu.tmx.spring.spring.service;

public class BinarySearchTightCoupled {

    public int doBinarySearch(int[] numbers, int numberToSearchFor){

        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        return 3;
    }
}

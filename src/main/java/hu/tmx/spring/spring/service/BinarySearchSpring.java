package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchSpring {
    //VÁLTOZÓ ALAPÚ
    /*
    @Autowired
    private SortAlgorithm sortAlgorithm;
    */
    //KONSTRUKTOR ALAPÚ
    /*
    private SortAlgorithm sortAlgorithm;
    @Autowired
    public BinarySearchSpring(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    */
    //SETTER ALAPÚ
    private SortAlgorithm sortAlgorithm;
    @Autowired
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }
}

package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchSpring {

    //ha több class tartozik egy interface-hez name alapján lehet behúzni (ha nem a @Primary annotációt használjuk)
    private SortAlgorithm bubbleSortAlgorithm;

    @Autowired
    public void setSortAlgorithm(SortAlgorithm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        return 3;
    }
}

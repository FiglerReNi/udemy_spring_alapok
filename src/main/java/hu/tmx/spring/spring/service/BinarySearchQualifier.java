package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchQualifier {

    private SortAlgorithm sortAlgorithm;

    @Autowired
    @Qualifier("quick")
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int doBinarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }
}

package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchScope {
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

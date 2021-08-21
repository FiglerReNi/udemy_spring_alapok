package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        return numbers;
    }
}

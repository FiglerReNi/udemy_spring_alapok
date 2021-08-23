package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.interfaces.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){
        return numbers;
    }
}
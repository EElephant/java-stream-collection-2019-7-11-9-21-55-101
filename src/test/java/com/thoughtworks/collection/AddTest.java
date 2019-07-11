package com.thoughtworks.collection;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class AddTest {

    @Test
    public void should_get_sum_of_evens() {
        //求leftBorder 和rightBorder之间的偶数和
        int leftBorder = 1;
        int rightBorder = 10;

        Add add = new Add();
        assertThat(add.getSumOfEvens(leftBorder, rightBorder)).isEqualTo(30);
        assertThat(add.getSumOfEvens(rightBorder, leftBorder)).isEqualTo(30);
    }


    @Test
    public void should_get_triple_and_add_two() {
        //求数组中每个元素的3倍加2的和
        Integer[] array = new Integer[]{1, 5, 7, 11, 35, 67};
        List<Integer> arrayList = Arrays.asList(array);

        Add add = new Add();

        assertThat(add.getSumTripleAndAddTwo(arrayList)).isEqualTo(390);
    }

    @Test
    public void should_get_triple_of_odd_and_add_two() {
        //求数组中奇数元素的3倍加2，偶数元素不变的数组
        Integer[] array = new Integer[]{1, 5, 7, 12, 11, 35, 54, 67, 70};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[]{5, 17, 23, 12, 35, 107, 54, 203, 70};
        List<Integer> resultList = Arrays.asList(result);

        Add add = new Add();

        assertThat(add.getTripleOfOddAndAddTwo(arrayList)).isEqualTo(resultList);
    }


    @Test
    public void should_return_average_of_even() {
        //求数组中所有偶数的平均数
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Add add = new Add();
        assertThat(add.getAverageOfEven(arrayList)).isEqualTo((double) 3);
    }

    @Test
    public void should_return_unrepeated_elements_from_evens() {
        //找出数组中的所有偶数，从中剔除重复数据并返回
        Integer[] array = new Integer[]{1, 2, 3, 4, 1, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Integer[] result = new Integer[]{2, 4};
        List<Integer> resultList = Arrays.asList(result);

        Add add = new Add();
        assertThat(add.getUnrepeatedFromEvenIndex(arrayList)).isEqualTo(resultList);
    }


}

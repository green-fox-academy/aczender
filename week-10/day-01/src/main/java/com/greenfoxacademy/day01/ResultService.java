package com.greenfoxacademy.day01;

import org.springframework.stereotype.Service;

@Service
public class ResultService {

    private Result result;

    public Integer factor(int number) {
        int factor = 1;
        for (Integer i = number; i > 0; i--) {
            factor = factor * i;
        }
        return factor;
    }

    public Integer sum(int number) {
        int sum = 0;
        for (Integer i = number; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}

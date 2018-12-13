package com.greenfoxacademy.hellobean.model;

import com.greenfoxacademy.hellobean.MyColor;
import com.greenfoxacademy.hellobean.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("this is red");
    }
}

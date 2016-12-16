package com.zqw.testspring.impl;

import com.zqw.testspring.intf.Disc;
import org.springframework.stereotype.Component;

/**
 * Created by UFGOV on 2016/12/16.
 */
@Component
public class YogaLin implements Disc {
    public void paly() {
        System.out.printf("我们曾相爱，想到就心酸");
    }
}

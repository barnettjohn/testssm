package com.zqw.testspring.impl;

import com.zqw.testspring.intf.Disc;
import com.zqw.testspring.intf.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by UFGOV on 2016/12/16.
 */
@Component
public class CdPlayer implements Player {
    @Autowired
    Disc cd;
    public void play() {
        cd.paly();
    }
}

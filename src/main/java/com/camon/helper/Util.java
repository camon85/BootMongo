package com.camon.helper;

import com.domingosuarez.boot.autoconfigure.jade4j.JadeHelper;

/**
 * Created by jooyong on 2016-02-25.
 */
@JadeHelper
public class Util {
    public String format(int number) {
        return "input : " + number;
    }
}

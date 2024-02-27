package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements Database
{

    public int write(String inputString)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}

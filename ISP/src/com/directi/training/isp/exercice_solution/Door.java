package com.directi.training.isp.exercise;

public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

}

public interface TimeOutCallback
{
    void timeOutCallback();
}

public interface ProximityCallback
{
    void proximityCallback();
}
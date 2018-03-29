package io.micro.log;

import java.util.concurrent.TimeUnit;

public class Timer {

    long startTimeMillis;

    public Timer(){
        startTimeMillis = System.currentTimeMillis();
    }

    public long getCurrent(){
        return System.currentTimeMillis();
    }

    public String getDiffFormatted(){
        long diffMillis = getCurrent() - startTimeMillis;
        String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(diffMillis),
                TimeUnit.MILLISECONDS.toMinutes(diffMillis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diffMillis)),
                TimeUnit.MILLISECONDS.toSeconds(diffMillis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(diffMillis)));
        return hms;
    }

    public long getDiff(){
        return startTimeMillis - getCurrent();
    }
}

package ex2;

import java.time.Duration;
import java.time.LocalTime;

public class Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch() {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void setEndTime() {
        this.endTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        setStartTime();
        System.out.println("Start time: " + getStartTime());
    }

    public void stop() {
        setEndTime();
        System.out.println("End time: " + getEndTime());
    }

    public double elapsedTime() {
        Duration elapsedTime = Duration.between(startTime, endTime);
        double elapsedSeconds = elapsedTime.getSeconds();
        return elapsedSeconds;
    }
}

import javafx.scene.paint.Stop;

import java.security.Key;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = java.time.LocalTime.now();
    }

    public LocalTime start() {
        return this.startTime;
    }

    public LocalTime stop() {
        this.endTime = java.time.LocalTime.now();
        return this.endTime;
    }

    public String getElapsedTime() {
        String time = Duration.between(this.start(), this.stop()).toString();
        return time;
    }
}

class Main4 {
    public static void main(String[] args) {
        System.out.println("press 1 to start end 2 to stop watch");
        Scanner input = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        int keyStart = input.nextInt();
        if (keyStart == 1) {
            System.out.println(watch.start());
        }
        System.out.println("press 2 to stop watch");
        int keyStop = input.nextInt();
        if (keyStop == 2) {
            System.out.println(watch.stop());
        }
        System.out.println("thoi gian troi qua: " + watch.getElapsedTime());
    }
}

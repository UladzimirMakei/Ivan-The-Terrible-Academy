package com.ivantheterrible.cycle.countdown;

import static java.lang.System.*;
import static java.lang.Thread.*;

public class CountdownMethod {
    public static void numberCountdown (int number) throws InterruptedException {
        while (number != -1) {
            if (number == 0) out.println("Go!");
            else out.println(number);
            sleep(1_000);
            number--;
        }
    }
}


package runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BostonMarathon {

    static class Runner {
        String name;
        int time; 

        Runner(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public String toString() {
            return name + " - " + time + " minutes";
        }
    }

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
runners.add(new Runner("Neda", 343));
runners.add(new Runner("Aaron", 317));
runners.add(new Runner("Kate", 265));
runners.add(new Runner("Elena ",341));
runners.add(new Runner("Thomas", 273));
runners.add(new Runner("Hamilton", 278));
runners.add(new Runner("Suzie", 329));
runners.add(new Runner("Phil", 445));
runners.add(new Runner("Matt", 402));
runners.add(new Runner("Alex", 388));
runners.add(new Runner("Emma", 275));
runners.add(new Runner("John", 243 ));
runners.add(new Runner("James", 334));
runners.add(new Runner("Jane", 412));
runners.add(new Runner("Emily", 393 ));
runners.add(new Runner("Daniel", 299));

        // Sort runners by time in ascending order
        Collections.sort(runners, new Comparator<Runner>() {
            @Override
            public int compare(Runner r1, Runner r2) {
                return Integer.compare(r1.time, r2.time);
            }
        });

        if (runners.size() < 2) {
            System.out.println("Not enough runners to determine the fastest and second fastest.");
            return;
        }

        // Get the fastest and second fastest runners
        Runner fastest = runners.get(0);
        Runner secondFastest = runners.get(1);

        // Print the results
        System.out.println("Fastest Runner: " + fastest);
        System.out.println("Second Fastest Runner: " + secondFastest);
    }
}

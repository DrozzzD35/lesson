package Projects.ProjectsRepeat001;

public class MonthData {
    int[] days = new int[30];

    int maxSteps() {
        int max = 0;
        for (int steps : days) {
            if (max < steps) max = steps;
        }
        return max;
    }

    int sumSteps() {
        int sum = 0;
        for (int steps : days) {
            sum += steps;
        }
        return sum;
    }

    int averageSteps() {
        int average = 0;
        int sum = sumSteps();
        average = sum / days.length;
        return average;
    }

    int bestSeriesOfSteps(int goalOfSteps) {
        int bestSeries = 0, current = 0;
        for (int steps : days) {
            if (steps >= goalOfSteps) current++;
            else current=0;
            bestSeries = Math.max(bestSeries, current);

        }
        return bestSeries;
    }
}

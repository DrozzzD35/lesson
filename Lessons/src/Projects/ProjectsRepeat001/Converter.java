package Projects.ProjectsRepeat001;

public class Converter {

    int converterToKm(int steps) {
        return (steps * 75) / 100000;
    }

    int converterToCalories(int steps) {
        return ((80 * steps) * 75) / 100000;
    }
}

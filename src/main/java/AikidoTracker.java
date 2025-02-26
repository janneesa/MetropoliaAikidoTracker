import java.util.HashMap;

public class AikidoTracker {
    private HashMap <String, Integer> trainingLog;

    public AikidoTracker() {
        trainingLog = new HashMap<>();
    }

    public void addTraining(String date, int hours) {
        trainingLog.put(date, hours);
    }

    public int getTotalTrainingHours() {
        int totalHours = 0;
        for (int hours : trainingLog.values()) {
            totalHours += hours;
        }
        return totalHours;
    }

    public boolean isEligibleForKyuGraduation() {
        return trainingLog.size() >= 100 || getTotalTrainingHours() >= 6 * 30;
    }
}

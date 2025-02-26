import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {

    @Test
    void addTraining() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addTraining("2021-01-01", 20);
        assertEquals(20, tracker.getTotalTrainingHours());
    }

    @org.junit.jupiter.api.Test
    void getTotalTrainingHours() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addTraining("2021-01-01", 20);
        tracker.addTraining("2021-02-01", 20);
        assertEquals(40, tracker.getTotalTrainingHours());
    }

    @org.junit.jupiter.api.Test
    void isEligibleForKyuGraduation() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addTraining("2021-01-01", 180);
        assertTrue(tracker.isEligibleForKyuGraduation());
    }

    @org.junit.jupiter.api.Test
    void isNotEligibleForKyuGraduation() {
        AikidoTracker tracker = new AikidoTracker();
        tracker.addTraining("2021-01-01", 160);
        assertFalse(tracker.isEligibleForKyuGraduation());
    }
}
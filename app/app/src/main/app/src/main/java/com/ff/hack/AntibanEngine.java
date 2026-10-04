package com.ff.hack;

public class AntibanEngine {
    
    public static double getAimbotDeviation(int intensity) {
        // Intensity 0-3: OFF, LIGHT, AGGRESSIVE, EXTREME
        double[] deviations = {0, 0.5, 0.3, 0.0};
        return deviations[Math.max(0, Math.min(3, intensity))];
    }
    
    public static boolean shouldHeadshot() {
        // 92% headshot rate, drops after 8 consecutive
        return Math.random() < 0.92;
    }
    
    public static double getMovementVariation() {
        // ±5% randomness
        return (Math.random() - 0.5) * 0.1;
    }
    
    public static boolean shouldActNormal() {
        // 8% chance to deliberately miss
        return Math.random() < 0.08;
    }
    
    public static double getNetworkJitter() {
        return Math.random() * 50; // 0-50ms jitter
    }
    
    public static void recordAimAngle(float angle) {
        // Log for antiban pattern analysis
    }
    
    public static boolean hasNaturalVariance() {
        return Math.random() > 0.15;
    }
}

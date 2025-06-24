public class SensitivityConverter {
    private static final double COUNTER_STRIKE = 1.0;
    private static final double VALORANT = 0.314;
    private static final double OVERWATCH = 3.33;
    private static final double APEX_LEGENDS = 1.0;

    // Returns the multiplier for the given game index
    private static double getGameMultiplier(int gameIndex) {
        switch (gameIndex) {
            case 0: return COUNTER_STRIKE;
            case 1: return VALORANT;
            case 2: return OVERWATCH;
            case 3: return APEX_LEGENDS;
            default: throw new IllegalArgumentException("Invalid game index");
        }
    }

    // Converts sensitivity from one game to another
    public static double convert(double sensitivity, int fromGameIndex, int toGameIndex) {
        double fromMultiplier = getGameMultiplier(fromGameIndex);
        double toMultiplier = getGameMultiplier(toGameIndex);
        return toMultiplier * (sensitivity / fromMultiplier);
    }
}

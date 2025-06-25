public class SensitivityConverter {
    private static final double SOURCE_ENGINE = 1.0;
    private static final double VALORANT = 0.314;
    private static final double MINECRAFT = 21.0;
    private static final double THE_FINALS = 22.0;
    private static final double OVERWATCH = 3.33;
    private static final double FORTNITE = 4.0;
    private static final double CALL_OF_DUTY = 3.3;
    private static final double HALO_INFINITE = 0.978;

    // Returns the multiplier for the given game index
    private static double getGameMultiplier(int gameIndex) {
        switch (gameIndex) {
            case 0: return SOURCE_ENGINE;
            case 1: return VALORANT;
            case 2: return MINECRAFT;
            case 3: return THE_FINALS;
            case 4: return OVERWATCH;
            case 5: return FORTNITE;
            case 6: return CALL_OF_DUTY;
            case 7: return HALO_INFINITE;
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

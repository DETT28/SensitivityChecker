public class SensitivityConverterTestApp {
    public static void main(String[] args) {
        String[] games = {
            "Source Engine",
            "Valorant",
            "Minecraft",
            "The Finals",
            "Overwatch",
            "Fortnite",
            "Call of Duty",
            "Halo Infinite"
        };

        double testSensitivity = 1.6;
        double testDPI = 800.0;

        System.out.println("Testing SensitivityConverter with test sensitivity: " + testSensitivity + " and DPI: " + testDPI);
        for (int from = 0; from < games.length; from++) {
            for (int to = 0; to < games.length; to++) {
                if (from == to) continue;
                double converted = SensitivityConverter.convert(testSensitivity, from, to);
                int eDPI = SensitivityConverter.eDPI(converted, testDPI);
                System.out.printf("%s (%.4f) -> %s: %.4f (eDPI: %d)%n",
                        games[from], testSensitivity, games[to], converted, eDPI);
            }
        }
    }
}

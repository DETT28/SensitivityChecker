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

        double testSensitivity = 2.5;

        System.out.println("Testing SensitivityConverter with test sensitivity: " + testSensitivity);
        for (int from = 0; from < games.length; from++) {
            for (int to = 0; to < games.length; to++) {
                if (from == to) continue;
                double converted = SensitivityConverter.convert(testSensitivity, from, to);
                System.out.printf("%s (%.4f) -> %s: %.4f%n",
                        games[from], testSensitivity, games[to], converted);
            }
        }
    }
}

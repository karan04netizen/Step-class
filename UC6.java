public class Slash {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();
 
        String[] banner = new String[7];

        // Combine letters row-by-row
        for (int i = 0; i < banner.length; i++) {
            banner[i] = String.join("  ",
                    letterO[i],
                    letterO[i],
                    letterP[i],
                    letterS[i]);
        }

        // Render banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds letter O pattern
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Builds letter P pattern
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Builds letter S pattern
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}

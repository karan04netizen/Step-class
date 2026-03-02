public class Class {

    public static void main(String[] args) {

        // Declaration + Initialization combined
        String[] banner = {
                String.join(" ", "*****", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*", "*", "    *"),
                String.join(" ", "*   *", "*", "*", "    *"),
                String.join(" ", "*****", "*", "*", "*****"),
                String.join(" ", "", "", "", "") // spacing consistency if needed
        };

        // Enhanced for-loop for printing
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

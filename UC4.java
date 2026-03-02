public class App {

    public static void main(String[] args) {

        // Store banner lines inside String array
        String[] banner = {

                String.join(" ", "*****", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*   *", "*   *", "*    "),
                String.join(" ", "*   *", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*", "*", "    *"),
                String.join(" ", "*   *", "*", "*", "    *"),
                String.join(" ", "*****", "*", "*", "*****")
        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

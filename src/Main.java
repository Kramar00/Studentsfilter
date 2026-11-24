import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader("studentsEN.txt",
                                java.nio.charset.StandardCharsets.UTF_16));
                FileWriter writer = new FileWriter("studentsGrade5.txt")
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.trim().endsWith("5")) {
                    writer.write(line + "\n");
                }
            }
        }
    }
}

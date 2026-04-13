package kata.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class ProgressTracker {

    private static final String FILE_PATH = "progress/progress.txt";
    private static final Set<String> problemsSolved = new TreeSet<>();

    public static void addProblem(String problemName) {
        problemsSolved.add(problemName);
    }

    public static void recordIfAllPassed() {
        String today = LocalDate.now().toString();
        Path filePath = Paths.get(FILE_PATH);
        Path parent = filePath.getParent();

        try {
            if (parent != null) {
                Files.createDirectories(parent);
            }

            if (Files.exists(filePath)) {
                String content = new String(Files.readAllBytes(filePath), StandardCharsets.UTF_8);
                if (content.contains(today)) return;
            }

            if (problemsSolved.isEmpty()) return;

            try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
                writer.write(
                        today +
                                " | Problems: " + String.join(", ", problemsSolved) +
                                " | Count: " + problemsSolved.size() +
                                " | Status: PASS\n"
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

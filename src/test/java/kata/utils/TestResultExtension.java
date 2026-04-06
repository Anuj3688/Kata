package kata.utils;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestResultExtension implements AfterAllCallback {

    @Override
    public void afterAll(ExtensionContext context) {

        if (!context.getExecutionException().isPresent()) {

            String className = context.getRequiredTestClass().getSimpleName();

            // Remove "Test" suffix → actual problem name
            String problemName = className.replace("Test", "");

            ProgressTracker.addProblem(problemName);

            // Try writing (will only write once per day)
            ProgressTracker.recordIfAllPassed();
        }
    }
}
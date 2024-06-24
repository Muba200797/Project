package interviewprep;

public class FinallyBlockException {
    @SuppressWarnings("finally")
	public static void main(String[] args) {
        try {
            try {
                // Code that may throw an exception
                throw new RuntimeException("Exception in try block");
            } finally {
                // Code in finally block
                throw new RuntimeException("Exception in finally block");
            }
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


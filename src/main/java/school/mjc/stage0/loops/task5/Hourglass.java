package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height % 2 == 0) {
            System.out.println("The height must be an odd number.");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                // Calculate the number of spaces to print
                int spaces = Math.abs(height / 2 - i);
                // Print spaces before the '8's in each row
                if (j < spaces) {
                    System.out.print(" ");
                } else if (j < height - spaces) {
                    // Print '8's for the hourglass shape
                    System.out.print("8");
                }
            }
            // Move to the next line after printing one row of the hourglass
            System.out.println();
        }
    }
}

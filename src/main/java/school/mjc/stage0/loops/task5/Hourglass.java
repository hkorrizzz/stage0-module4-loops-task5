package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height % 2 == 0) {
            height++; // Increase size by 1 if it's even to make it odd
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                // Calculate the number of spaces to print on each side
                int spaces = Math.abs(height / 2 - i);
                if (j >= spaces && j < height - spaces) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

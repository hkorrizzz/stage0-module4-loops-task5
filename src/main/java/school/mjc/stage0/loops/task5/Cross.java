package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int middle = sideLength / 2;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                // Print '8' if we're at the middle row or column, otherwise print space
                if (i == middle || j == middle) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing one row of the cross
            System.out.println();
        }
    }
}

package pl.sdacademy.java.basic.exercises.extras;

public class Task4 {
    private static final char SPACE = ' ';
    private static final char STAR = '*';
    private static final int WAVE_HEIGHT = 4;
    private static final int WAVE_LENGTH = 26;

    public static void main(String[] args) {
        drawWave();
    }

    private static void drawWave() {
        char[][] arrays = new char[WAVE_HEIGHT][WAVE_LENGTH];
        fillMatrixWithSpaces(arrays);
        addStarsToMatrix(arrays);
        printMatrix(arrays);
    }

    private static void addStarsToMatrix(char[][] arrays) {
        int counter = 0;
        boolean isGoingDown = true;
        for(int i = 0; i < WAVE_LENGTH; i++) {
            arrays[counter][i] = STAR;
            if(isGoingDown) {
                if(counter == WAVE_HEIGHT - 1) {
                    isGoingDown = false;
                    continue;
                }
                counter++;
            } else {
                if(counter == 0) {
                    isGoingDown = true;
                    continue;
                }
                counter--;
            }
        }
    }

    private static void fillMatrixWithSpaces(char[][] arrays) {
        for(int i = 0; i < WAVE_HEIGHT; i++) {
            for(int j = 0; j < WAVE_LENGTH; j++) {
                arrays[i][j] = SPACE;
            }
        }
    }

    private static void printMatrix(char[][] arrays) {
        for(int i = 0; i < WAVE_HEIGHT; i++) {
            for(int j = 0; j < WAVE_LENGTH; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}

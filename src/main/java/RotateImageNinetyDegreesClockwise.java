package main.java;

public class RotateImageNinetyDegreesClockwise {

    private int[] getDestinationPosition(int[] currentPosition, int rootMatrixSize) {
        int[] destinationPosition = new int[2];
        destinationPosition[0] = currentPosition[1];
        destinationPosition[1] = rootMatrixSize - 1 - currentPosition[0];
        return destinationPosition;
    }

    private void setValueAtPosition(int[][] matrix, int[] position, int value) {
        matrix[position[0]][position[1]] = value;
    }

    private int getValueAtPosition(int[][] matrix, int[] position) {
        return matrix[position[0]][position[1]];
    }


    private void rotateFromPivot(int[][] matrix, int[] pivot, int subMatrixSize) {

        if (subMatrixSize == 1) {
            return;
        }

        int[] current = new int[2];
        current[0] = pivot[0];
        current[1] = pivot[1];

        int valueToSet = getValueAtPosition(matrix, current);

        for (int i = 0; i < 4; i++) {
            int[] destination = getDestinationPosition(current, matrix.length);
            int temp = getValueAtPosition(matrix, destination);
            setValueAtPosition(matrix, destination, valueToSet);

            valueToSet = temp;
            current[0] = destination[0];
            current[1] = destination[1];
        }
    }

    private void rotateOuter(int[][] matrix, int[] start, int subMatrixSize) {
        int pivots = subMatrixSize - 1;
        for (int i = 0; i < pivots; i++) {
            rotateFromPivot(matrix, new int[] {start[0], start[1] + i}, subMatrixSize);
        }
    }


    public void rotate(int[][] matrix) {
        for (int i = 0, n = matrix.length; n > 0; i++, n -= 2) {
            int[] start = new int[] {i, i};
            rotateOuter(matrix, start, n);
        }
    }
}

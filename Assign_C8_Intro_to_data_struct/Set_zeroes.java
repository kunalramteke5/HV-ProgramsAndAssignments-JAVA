public void setZeroes(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] col = new boolean[matrix[0].length];

    // Identify rows and columns that need to be zeroed
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    // Zero out rows
    for (int i = 0; i < row.length; i++) {
        if (row[i]) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    // Zero out columns
    for (int j = 0; j < col.length; j++) {
        if (col[j]) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
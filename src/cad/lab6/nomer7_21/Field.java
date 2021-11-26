package cad.lab6.nomer7_21;

public class Field {

    private int rows;
    private int columns;

    private int[][] field;

    public Field(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        field = new int[rows][columns];
    }

    public void draw(int x, int y) {
        if (x > 0 && y > 0 && x <= columns && y <= columns) {
            field[x][y] = 1;
        }
    }

    public void displayField() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (field[i][j] == 0) {
                    System.out.print(" ");
                }

                if (field[i][j] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

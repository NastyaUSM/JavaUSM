package cad.lab6.nomer7_21;

public class Turtle {

    private PenStatus status;
    private Direction direction;
    private int x;
    private int y;
    private Field field;

    public Turtle(Field field) {
        this.status = PenStatus.UP;
        this.direction = Direction.DOWN;
        this.x = 0;
        this.y = 0;
        this.field = field;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDrawing() {
        return status == PenStatus.DOWN;
    }

    public void startDrawing() {
        status = PenStatus.DOWN;
    }

    public void stopDrawing() {
        status = PenStatus.UP;
    }

    public void rotate(Rotate rotate) {
        if (direction == Direction.DOWN) {
            if (rotate == Rotate.LEFT) {
                direction = Direction.RIGHT;
            } else {
                direction = Direction.LEFT;
            }
        }

        if (direction == Direction.UP) {
            if (rotate == Rotate.LEFT) {
                direction = Direction.LEFT;
            } else {
                direction = Direction.RIGHT;
            }
        }

        if (direction == Direction.LEFT) {
            if (rotate == Rotate.LEFT) {
                direction = Direction.DOWN;
            } else {
                direction = Direction.UP;
            }
        }

        if (direction == Direction.RIGHT) {
            if (rotate == Rotate.LEFT) {
                direction = Direction.UP;
            } else {
                direction = Direction.DOWN;
            }
        }
    }

    public void move(int steps) {
        int newX = x;
        int newY = y;
        if (direction == Direction.DOWN) {
            newY = newY + steps;
        }

        if (direction == Direction.LEFT) {
            newX = newX - steps;
        }

        if (direction == Direction.RIGHT) {
            newX = newX + steps;
        }

        if (direction == Direction.UP) {
            newY = newY - steps;
        }

        if (isDrawing() && (newX >= 0 || newY >= 0)) {
            if (newX > x) {
                for (int i = x; i <= newX; i++) {
                    field.draw(y, i);
                }
            }

            if (newX < x) {
                for (int i = x; i >= newX; i--) {
                    field.draw(y, i);
                }
            }

            if (newY > y) {
                for (int i = y; i <= newY; i++) {
                    field.draw(i, x);
                }
            }

            if (newY < y) {
                for (int i = y; i >= newY; i--) {
                    field.draw(i, x);
                }
            }
        }

        x = newX;
        y = newY;
    }

    private enum PenStatus {
        UP,
        DOWN
    }

    private enum Direction {
        LEFT,
        UP,
        RIGHT,
        DOWN
    }

    public enum Rotate {
        LEFT,
        RIGHT
    }
}

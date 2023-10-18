package com.epam.training.student_tatsiana_mikhnavets.java_basics.enums.compass;

public  enum Direction {
    N(), NE(), E(), SE(), S(), SW(), W(), NW();

    Direction() {
    }
    public static Direction ofDegrees(int degrees) {
        degrees = (degrees>=0) ? (degrees % 360) : (degrees % 360 +360);
        for (Direction direction : Direction.values()) {
            if (direction.ordinal() * 45 == degrees) {
                return direction;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        degrees = (degrees>=0) ? (degrees % 360) : (degrees %360 + 360);
        Direction closestDirection = Direction.N;
        for (Direction direction : Direction.values()) {
            if (Math.abs(direction.ordinal() *45 - degrees) < 23) {
                closestDirection = direction;
                break;
            }
        }
        return closestDirection;
    }

    public Direction opposite() {
        int degrees = Direction.this.ordinal() *45;
        Direction oppositeDirection = Direction.N;
        for (Direction direction : Direction.values()) {
            if (direction.ordinal()*45 == (degrees + 180) % 360) {
                oppositeDirection = direction;
                break;
            }
        }
        return oppositeDirection;
    }

    public int differenceDegreesTo(Direction direction) {
        int difference = Math.abs(this.ordinal() - direction.ordinal()) *45;
        return (difference>180) ? (360 - difference) : difference;
    }
}


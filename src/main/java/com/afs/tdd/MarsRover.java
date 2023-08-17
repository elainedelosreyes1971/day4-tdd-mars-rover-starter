package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        switch (givenCommand) {
            case MOVE:
                moveForward();
                break;
            case TURN_LEFT:
                turnLeft();
                break;
            case TURN_RIGHT:
                turnRight();
                break;
            default:
                break;
        }
    }

    private void turnRight() {
    }

    private void turnLeft() {
        switch(location.getDirection()){
            case NORTH:
                location.setDirection(Direction.WEST);
                break;
            default:
                break;
        }
    }

    private void moveForward() {
        switch (location.getDirection()) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;
            default:
                break;
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}

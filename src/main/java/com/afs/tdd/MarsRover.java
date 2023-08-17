package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        switch(givenCommand){
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
    }

    private void moveForward() {
        switch(location.getDirection()){
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
            default:
                break;
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}

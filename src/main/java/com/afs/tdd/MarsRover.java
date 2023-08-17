package com.afs.tdd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsRover {

    private final Location location;

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
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.EAST);
                break;
            case SOUTH:
                location.setDirection(Direction.WEST);
                break;
            case EAST:
                location.setDirection(Direction.SOUTH);
                break;
            case WEST:
                location.setDirection(Direction.NORTH);
                break;
            default:
                break;
        }
    }

    private void turnLeft() {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.WEST);
                break;
            case SOUTH:
                location.setDirection(Direction.EAST);
                break;
            case EAST:
                location.setDirection(Direction.NORTH);
                break;
            case WEST:
                location.setDirection(Direction.SOUTH);
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

    public void executeBatchCommands(List<String> commands) {
        Map<String, Command> commandCache = createCommandMap();
        for (String command : commands) {
            executeCommand(commandCache.get(command));
        }
    }

    private Map<String, Command> createCommandMap() {
        Map<String, Command> commandCache = new HashMap<>();
        commandCache.put("M", Command.MOVE);
        commandCache.put("L", Command.TURN_LEFT);
        commandCache.put("R", Command.TURN_RIGHT);
        return commandCache;
    }
}

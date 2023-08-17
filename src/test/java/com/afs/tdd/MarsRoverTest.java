package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    private Command givenCommand;
    private Location initialLocation;
    private MarsRover marsRover;
    private Location currentLocation;

    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        initialLocation = new Location(0, 0, Direction.NORTH);
        givenCommand = Command.MOVE;
        marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_south_location_when_executeCommand_given_0_0_S_and_command_Move() {
        //Given
        initialLocation = new Location(0, 0, Direction.SOUTH);
        givenCommand = Command.MOVE;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(-1, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());

    }

    @Test
    void should_change_to_east_location_when_executeCommand_given_0_0_E_and_command_Move() {
        //Given
        initialLocation = new Location(0, 0, Direction.EAST);
        givenCommand = Command.MOVE;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_west_location_when_executeCommand_given_0_0_W_and_command_Move() {
        //Given
        initialLocation = new Location(0, 0, Direction.WEST);
        givenCommand = Command.MOVE;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_west_when_executeCommand_given_0_0_N_and_command_turn_left(){
        //Given
        initialLocation = new Location(0, 0, Direction.NORTH);
        givenCommand = Command.TURN_LEFT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_east_when_executeCommand_given_0_0_S_and_command_turn_left(){
        //Given
        initialLocation = new Location(0, 0, Direction.SOUTH);
        givenCommand = Command.TURN_LEFT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_north_when_executeCommand_given_0_0_E_and_command_turn_left(){
        //Given
        initialLocation = new Location(0, 0, Direction.EAST);
        givenCommand = Command.TURN_LEFT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_south_when_executeCommand_given_0_0_W_and_command_turn_left(){
        //Given
        initialLocation = new Location(0, 0, Direction.WEST);
        givenCommand = Command.TURN_LEFT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }
    @Test
    void should_change_facing_direction_to_east_when_executeCommand_given_0_0_N_and_command_turn_right(){
        //Given
        initialLocation = new Location(0, 0, Direction.NORTH);
        givenCommand = Command.TURN_RIGHT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_west_when_executeCommand_given_0_0_S_and_command_turn_right(){
        //Given
        initialLocation = new Location(0, 0, Direction.SOUTH);
        givenCommand = Command.TURN_RIGHT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_south_when_executeCommand_given_0_0_E_and_command_turn_right(){
        //Given
        initialLocation = new Location(0, 0, Direction.EAST);
        givenCommand = Command.TURN_RIGHT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_facing_direction_to_north_when_executeCommand_given_0_0_W_and_command_turn_right(){
        //Given
        initialLocation = new Location(0, 0, Direction.WEST);
        givenCommand = Command.TURN_RIGHT;
        marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }
}

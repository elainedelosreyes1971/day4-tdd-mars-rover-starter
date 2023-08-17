package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    Command givenCommand;
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_south_location_when_executeCommand_given_0_0_S_and_command_Move(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);

        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();

        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(-1,currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());

    }
}

package com.codedifferently.labs.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.Player;

public class PlayerTest {
    @Test
    public void PlayerTest01(){
        String expected = "Name: LeBron\n" +
                "Height: 2.08\n" +
                "yearsInLeague: 20\n" +
                "Team: Lakers\n" +
                "Team Lakers Tryouts\n" +
                "Team Lakers No tryouts\n" +
                "Team Lakers Tryouts";
        String actual = Player.display();
        Assertions.assertEquals(expected, actual);
    }
}

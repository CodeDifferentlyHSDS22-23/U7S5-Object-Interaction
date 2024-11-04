package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.Team;

public class TeamTest {
    @Test
    public void TeamTest01(){
        String expected = "Name: LeBron\n" +
                "Height: 2.08\n" +
                "yearsInLeague: 20\n" +
                "Team: Lakers\n" +
                "Incorrect code\n" +
                "Team Lakers Tryouts\n" +
                "Team Lakers No tryouts";
        String actual = Team.Recruit();
        Assertions.assertEquals(expected, actual);
    }
}

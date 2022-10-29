package countingUrinals;

import static org.junit.Assert.*;

import org.junit.Test;

public class UrinalsTestCase extends Urinals {

	@Test
	public void readFileTest() {
        IOException thrown = assertThrows(
                IOException.class,
                () -> main.readFile("urinal.dat"),"message");

        assertTrue(thrown.getMessage().contains("IOException read file"));
    }
}


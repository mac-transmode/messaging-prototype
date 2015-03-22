package se.transmode.tnm.map.rest.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.io.IOException;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PositionTest {

    private static final String STOCKHOLM_JSON = "{\"latitude\":59.1,\"longitude\":18.0}";
    static final Position STOCKHOLM = Position.position().latitude(59.1).longitude(18.0).build();

    @Test
    public void asJson_should_return_json() throws IOException {
        final String writeValueAsString = new ObjectMapper().writeValueAsString(STOCKHOLM);
        System.out.println(writeValueAsString);
        assertThat(writeValueAsString, equalTo(STOCKHOLM_JSON));
    }

    @Test
    public void fromJson_should_return_json() throws IOException {
        assertThat(new ObjectMapper().readValue(STOCKHOLM_JSON, Position.class), equalTo(STOCKHOLM));
    }
}

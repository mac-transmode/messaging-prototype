package se.transmode.tnm.map.rest.api;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.io.IOException;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NodeTest {

    private final static String NODE_JSON = "{\"id\":\"idValue\",\"userLabel\":\"userLabelValue\","
            + "\"position\":{\"latitude\":59.1,\"longitude\":18.0}}";
    private final static Node NODE = Node.node().id("idValue").userLabel("userLabelValue")
            .position(PositionTest.STOCKHOLM).build();

    @Test
    public void asJson_should_return_json() throws IOException {
        assertThat(new ObjectMapper().writeValueAsString(NODE), equalTo(NODE_JSON));
    }

    @Test
    public void fromJson_should_return_value() throws IOException {
        assertThat(new ObjectMapper().readValue(NODE_JSON, Node.class), equalTo(NODE));
    }
}

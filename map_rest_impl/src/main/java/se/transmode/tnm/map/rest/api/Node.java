package se.transmode.tnm.map.rest.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

/**
 * Represents a network element with a geographical position.
 */
@Value
@Builder(builderMethodName = "node")
public class Node {
    @NonNull
    private final String id;
    @NonNull
    private final String userLabel;
    @NonNull
    private final Position position;

    @JsonCreator
    public Node(@JsonProperty("id") String id, @JsonProperty("userLabel") String userLabel,
            @JsonProperty("position") Position position) {
        super();
        this.id = id;
        this.userLabel = userLabel;
        this.position = position;
    }
}

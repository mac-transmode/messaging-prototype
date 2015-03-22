package se.transmode.tnm.map.rest.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder(builderMethodName="position")
public class Position {
    @NonNull
    private final Double latitude;
    @NonNull
    private final Double longitude;
    
    @JsonCreator
    Position(@JsonProperty("latitude") Double latitude, @JsonProperty("longitude")  Double longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }    
}

package se.ystrom.push.l1.rest.api;

import com.google.common.base.Optional;
import lombok.Builder;
import lombok.Value;

/**
 *
 */
@Value
@Builder
public class L1Discovery {
    private final Optional<Long> started;
    private final L1DiscoveryStatus status;

    public static L1Discovery idle() {
        return L1Discovery.builder().started(Optional.<Long>absent()).status(L1DiscoveryStatus.IDLE).build();
    }

    public static L1Discovery running(long started) {
        return L1Discovery.builder().started(Optional.of(started)).status(L1DiscoveryStatus.RUNNING).build();
    }
}

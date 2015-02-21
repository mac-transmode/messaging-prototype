package se.ystrom.push.l1.rest.api;

import com.google.common.testing.EqualsTester;
import org.junit.Test;

public class L1DiscoveryTest {

    @Test
    public void should_be_equal_and_not_equal() {
        final L1Discovery running = L1Discovery.running(1);
        final L1Discovery idle = L1Discovery.idle();
        new EqualsTester().addEqualityGroup(running).addEqualityGroup(idle).testEquals();
    }
}
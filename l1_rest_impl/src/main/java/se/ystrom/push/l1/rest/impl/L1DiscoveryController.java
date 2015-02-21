package se.ystrom.push.l1.rest.impl;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import se.ystrom.push.l1.rest.api.L1Discovery;

/**
 *
 */
@Controller
public class L1DiscoveryController {
    @MessageMapping()
    @SendTo("l1/discovery")
    L1Discovery getL1Discovery() {
        return L1Discovery.idle();
    }
}

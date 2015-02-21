package se.ystrom.push.l1.rest.api;

import com.google.common.base.Optional;

/**
 *
 */
public interface L1DiscoveryRetrieval {

    Optional<L1Discovery> get(String id);
}

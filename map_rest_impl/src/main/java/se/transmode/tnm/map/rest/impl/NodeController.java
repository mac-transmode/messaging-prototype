package se.transmode.tnm.map.rest.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Map;

import se.transmode.tnm.map.rest.api.Node;
import se.transmode.tnm.map.rest.api.Position;

@RestController
@RequestMapping("/map/node")
public class NodeController {
    private static final Position POSITION_A = Position.position().latitude(58.00).longitude(18.00).build();
    private static final Position POSITION_B = Position.position().latitude(58.01).longitude(18.01).build();
    private static final Node NODE_A = Node.node().id("a").userLabel("Node A").position(POSITION_A).build();
    private static final Node NODE_B = Node.node().id("b").userLabel("Node B").position(POSITION_B).build();
    private final Map<String, Node> nodes;
    
    NodeController() {
        this(Maps.<String, Node>newConcurrentMap());
        nodes.put(NODE_A.getId(), NODE_A);
        nodes.put(NODE_B.getId(), NODE_B);
    }
    
    NodeController(Map<String, Node> nodes) {
        this.nodes = nodes;
    }

    @RequestMapping(method=RequestMethod.GET)
    public Collection<Node> getNodes() {
        return nodes.values();
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Node getNode(String id) {
        final Optional<Node> node = Optional.fromNullable(nodes.get(id));
        if (node.isPresent()) {
        return node.get();
        }
        else {
            throw new NodeNotFoundException(id);
        }
    }
    
    @ResponseStatus(HttpStatus.NOT_FOUND)
    class NodeNotFoundException extends RuntimeException {

        private static final long serialVersionUID = -7023387795963912749L;

        public NodeNotFoundException(String id) {
            super("could not find node '" + id + "'.");
        }
    }
}

package jc01_2020.classwork.forkjoinpool;

import java.util.Collection;

public interface Node {
    Collection<Node> getChildren();
    long getValue();
}

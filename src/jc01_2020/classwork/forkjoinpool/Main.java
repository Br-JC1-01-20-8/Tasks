package jc01_2020.classwork.forkjoinpool;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        Node root = getRootNode(3);
        System.out.println(new ForkJoinPool().invoke(new ValueSumCounter(root)));
    }

    private static Node getRootNode(int i) {
        return new Node() {
            @Override
            public Collection<Node> getChildren() {
                if (i < 10) {
                    return Arrays.asList(getRootNode(i + 1)/*, getOrphanNode(i + 1)*/);
                }
                return Collections.emptyList();
            }

            @Override
            public long getValue() {
                return i;
            }
        };
    }

    private static Node getOrphanNode(int i) {
        return new Node() {
            @Override
            public Collection<Node> getChildren() {
                return Collections.emptyList();
            }

            @Override
            public long getValue() {
                return i;
            }
        };
    }


}

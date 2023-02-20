package task2;

import java.util.*;

public class BfsTree {
    private final List<List<Boolean>> tree;
    private List<Integer> path;

    public BfsTree(final List<List<Boolean>> bfsTree) {
        this.tree = bfsTree;
    }

    public List<Boolean> bfs(final int n) {
        final List<Boolean> v = new ArrayList<>();
        for (final List<Boolean> i : tree) {
            i.get(0);
            v.add(false);
        }
        path = new ArrayList<>();

        final List<Integer> next = new ArrayList<>();

        next.add(n);

        while (!next.isEmpty()) {
            final int x = next.get(0);
            if (!v.get(x)) {
                path.add(x);
                v.set(x, true);

                for (int i = 0; i < tree.size(); i++) {
                    if (tree.get(x).get(i) && !v.get(i)) {
                        next.add(i);
                    }
                }
            }
            next.remove(0);
        }

        return v;
    }

    public List<Integer> getPath() {
        return path;
    }
}

package task2;

import java.util.*;

public class Tree {
    private final ArrayList<ArrayList<Boolean>> tree;
    private ArrayList<Integer> path = null;

    public Tree(ArrayList<ArrayList<Boolean>> tree) {
        this.tree = tree;
    }

    public ArrayList<Boolean> bfs(int n) {
        ArrayList<Boolean> v = new ArrayList<>();
        for (int i = 0; i < tree.size(); i++) {
            v.add(false);
        }
        path = new ArrayList<>();

        ArrayList<Integer> next = new ArrayList<>();

        next.add(n);

        while (!next.isEmpty()) {
            int x = next.get(0);
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

    public ArrayList<Integer> getPath() {
        return path;
    }
}

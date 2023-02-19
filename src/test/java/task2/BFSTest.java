package task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BFSTest {
    private static Tree tree;

    @BeforeAll
    public static void init() {
        ArrayList<ArrayList<Boolean>> t = new ArrayList<>() {
            {
                add(new ArrayList<>(List.of(false, false, true, false, false, false, false, false)));
                add(new ArrayList<>(List.of(false, false, false, false, false, false, false, false)));
                add(new ArrayList<>(List.of(true, false, false, false, true, false, true, false)));
                add(new ArrayList<>(List.of(false, false, false, false, false, false, false, true)));
                add(new ArrayList<>(List.of(false, false, true, false, false, false, true, false)));
                add(new ArrayList<>(List.of(false, false, false, false, false, false, true, false)));
                add(new ArrayList<>(List.of(false, false, true, false, true, true, false, false)));
                add(new ArrayList<>(List.of(false, false, false, true, false, false, false, false)));
            }
        };
        tree = new Tree(t);
    }

    @Test
    public void bfs7() {
        ArrayList<Boolean> res = tree.bfs(7);
        ArrayList<Boolean> v = new ArrayList<>(List.of(false, false, false, true, false, false, false, true));
        ArrayList<Integer> path = new ArrayList<>(List.of(7, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs0() {
        ArrayList<Boolean> res = tree.bfs(0);
        ArrayList<Boolean> v = new ArrayList<>(List.of(true, false, true, false, true, true, true, false));
        ArrayList<Integer> path = new ArrayList<>(List.of(0, 2, 4, 6, 5));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs1() {
        ArrayList<Boolean> res = tree.bfs(1);
        ArrayList<Boolean> v = new ArrayList<>(List.of(false, true, false, false, false, false, false, false));
        ArrayList<Integer> path = new ArrayList<>(List.of(1));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs6() {
        ArrayList<Boolean> res = tree.bfs(6);
        ArrayList<Boolean> v = new ArrayList<>(List.of(true, false, true, false, true, true, true, false));
        ArrayList<Integer> path = new ArrayList<>(List.of(6, 2, 4, 5, 0));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfsGraph4() {
        ArrayList<ArrayList<Boolean>> t = new ArrayList<>() {
            {
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
            }
        };
        Tree tree = new Tree(t);
        ArrayList<Boolean> res = tree.bfs(0);
        ArrayList<Boolean> v = new ArrayList<>(List.of(true, true, true, true));
        ArrayList<Integer> path = new ArrayList<>(List.of(0, 1, 2, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfsGraph6() {
        ArrayList<ArrayList<Boolean>> t = new ArrayList<>() {
            {
                add(new ArrayList<>(List.of(true, false, false, false, false, true)));
                add(new ArrayList<>(List.of(false, true, false, false, true, true)));
                add(new ArrayList<>(List.of(false, false, true, true, true, false)));
                add(new ArrayList<>(List.of(false, false, true, true, false, false)));
                add(new ArrayList<>(List.of(false, true, true, false, true, false)));
                add(new ArrayList<>(List.of(true, true, false, false, false, true)));
            }
        };
        Tree tree = new Tree(t);
        ArrayList<Boolean> res = tree.bfs(0);
        ArrayList<Boolean> v = new ArrayList<>(List.of(true, true, true, true, true, true));
        ArrayList<Integer> path = new ArrayList<>(List.of(0, 5, 1, 4, 2, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }
}

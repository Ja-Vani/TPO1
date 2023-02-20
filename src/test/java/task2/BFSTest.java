package task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BFSTest {
    private static BfsTree tree;

    @BeforeAll
    public static void init() {
        List<List<Boolean>> t = new ArrayList<>() {
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
        tree = new BfsTree(t);
    }

    @Test
    public void bfs7() {
        List<Boolean> res = tree.bfs(7);
        List<Boolean> v = new ArrayList<>(List.of(false, false, false, true, false, false, false, true));
        List<Integer> path = new ArrayList<>(List.of(7, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs0() {
        List<Boolean> res = tree.bfs(0);
        List<Boolean> v = new ArrayList<>(List.of(true, false, true, false, true, true, true, false));
        List<Integer> path = new ArrayList<>(List.of(0, 2, 4, 6, 5));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs1() {
        List<Boolean> res = tree.bfs(1);
        List<Boolean> v = new ArrayList<>(List.of(false, true, false, false, false, false, false, false));
        List<Integer> path = new ArrayList<>(List.of(1));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfs6() {
        List<Boolean> res = tree.bfs(6);
        List<Boolean> v = new ArrayList<>(List.of(true, false, true, false, true, true, true, false));
        List<Integer> path = new ArrayList<>(List.of(6, 2, 4, 5, 0));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfsGraph4() {
        List<List<Boolean>> t = new ArrayList<>() {
            {
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
                add(new ArrayList<>(List.of(true, true, true, true)));
            }
        };
        BfsTree tree = new BfsTree(t);
        List<Boolean> res = tree.bfs(0);
        List<Boolean> v = new ArrayList<>(List.of(true, true, true, true));
        List<Integer> path = new ArrayList<>(List.of(0, 1, 2, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }

    @Test
    public void bfsGraph6() {
        List<List<Boolean>> t = new ArrayList<>() {
            {
                add(new ArrayList<>(List.of(true, false, false, false, false, true)));
                add(new ArrayList<>(List.of(false, true, false, false, true, true)));
                add(new ArrayList<>(List.of(false, false, true, true, true, false)));
                add(new ArrayList<>(List.of(false, false, true, true, false, false)));
                add(new ArrayList<>(List.of(false, true, true, false, true, false)));
                add(new ArrayList<>(List.of(true, true, false, false, false, true)));
            }
        };
        BfsTree tree = new BfsTree(t);
        List<Boolean> res = tree.bfs(0);
        List<Boolean> v = new ArrayList<>(List.of(true, true, true, true, true, true));
        List<Integer> path = new ArrayList<>(List.of(0, 5, 1, 4, 2, 3));
        assertArrayEquals(v.toArray(), res.toArray());
        assertArrayEquals(path.toArray(), tree.getPath().toArray());
    }
}

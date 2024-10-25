package random;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveSubFoldersFromTheFilesystemTest {
    private final RemoveSubFoldersFromTheFilesystem test = new RemoveSubFoldersFromTheFilesystem();

    @Test
    public void test() {
        Set<String> expected = Set.of("/a", "/c/d", "/c/f");
        Set<String> actual = test.removeSubfolders(new String[]{"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"}).stream().collect(Collectors.toSet());
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Set<String> expected = Set.of("/a");
        Set<String> actual = test.removeSubfolders(new String[]{"/a", "/a/b/c", "/a/b/d"}).stream().collect(Collectors.toSet());
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Set<String> expected = Set.of("/a/b/c", "/a/b/ca", "/a/b/d");
        Set<String> actual = test.removeSubfolders(new String[]{"/a/b/c", "/a/b/ca", "/a/b/d"}).stream().collect(Collectors.toSet());
        assertEquals(expected, actual);
    }
}

package random;

import java.util.*;

public class RemoveSubFoldersFromTheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        Folder root = new Folder();
        for (String folderName : folder) {
            List<String> dirs = getDirs(folderName);
            Folder current = root;
            for (String dir : dirs) {
                current = current.subfolders.compute(dir, (k, v) -> v == null ? new Folder() : v);
                if (current.isFolder) {
                    break;
                }
            }
            current.isFolder = true;
            if (current.dir == null) {
                current.dir = folderName;
            }
        }
        List<String> result = new ArrayList<>();
        Queue<Folder> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Folder current = queue.poll();
            if (current.isFolder) {
                result.add(current.dir);
            } else {
                current.subfolders.forEach((k, v) -> queue.add(v));
            }
        }
        return result;
    }

    private List<String> getDirs(String folderName) {
        List<String> dirs = new LinkedList<>();
        int startIndex = 1;
        for (int i = 1; i < folderName.length(); i++) {
            if (folderName.charAt(i) == '/') {
                dirs.add(folderName.substring(startIndex, i));
                startIndex = i + 1;
            }
        }
        dirs.add(folderName.substring(startIndex));
        return dirs;
    }

    private static class Folder {
        Map<String, Folder> subfolders = new HashMap<>();
        boolean isFolder = false;
        String dir;
    }
}

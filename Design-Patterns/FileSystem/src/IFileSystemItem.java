public interface IFileSystemItem {
    void ls(boolean indent);
    void openAll();
    int getSize();
    String getName();
    boolean isFolder();
}

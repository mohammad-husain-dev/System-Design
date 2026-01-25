public class File implements IFileSystemItem{

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public void ls(boolean indent) {
        System.out.println(name);
    }

    @Override
    public void openAll() {
        System.out.println(name);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return false;
    }
}

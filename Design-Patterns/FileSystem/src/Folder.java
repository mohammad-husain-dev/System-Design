import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystemItem{

    private String name;
    private List<IFileSystemItem> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<IFileSystemItem>();
    }

    public void add(IFileSystemItem item){
        children.add(item);
    }

    @Override
    public void ls(boolean indent) {
        for(IFileSystemItem child : this.children){
            System.out.println(child.getName());
        }
    }

    @Override
    public void openAll() {
        System.out.println(name);
        for(IFileSystemItem child : this.children){
            child.openAll();
        }
    }

    public IFileSystemItem cd(String name) {
        for(IFileSystemItem child : this.children){
            if(child.isFolder() && child.getName().equals(name))
                return child;
        }
        return null;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(IFileSystemItem child : this.children){
            size += child.getSize();
        }
        return size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}

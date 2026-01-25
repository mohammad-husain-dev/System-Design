//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder internal = new Folder("internal");
        Folder internal_internal = new Folder("internal_internal");

        File file1 = new File("file1", 1);
        File file2 = new File("file2", 1);
        File file3 = new File("file3", 1);
        File file4 = new File("file4", 1);
        File file5 = new File("file5", 1);
        File file6 = new File("file6", 1);


        root.add(file1);
        root.add(internal);
        internal.add(internal_internal);
        root.add(file2);
        internal.add(file3);
        internal.add(file4);
        internal_internal.add(file5);
        internal_internal.add(file6);

        root.ls(false);

        IFileSystemItem cwd = root.cd("internal");
        if(cwd != null) {
            System.out.println(cwd.getName());
        }
    }
}
public class TestFileName {

    public static void main(String[] args) {
        final String path = "/home/user/index.html";
        FileName myHomePage = new FileName(path, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }

}

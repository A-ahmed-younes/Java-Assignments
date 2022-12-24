import java.io.File;

public class Main {

    public static void recDirectory(File dir) {
        if (dir.listFiles() == null) {
            return;
        } else {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getAbsolutePath()+" <Dir>");
                    recDirectory(item);
                } else {
                    String access = "";
                    access = item.canRead() ? "r" : "-";
                    access += item.canWrite() ? "w" : "-";
                    access += item.canExecute() ? "x" : "-";
                    access += item.isHidden() || item.getName().startsWith(".") ? "h" : "-";
                    System.out.println(item.getAbsolutePath()+" <FILE> "+access);
                }
            }

        }
    }


    public static void main(String[] args) {

        File directoryPath = new File("C:\\Users\\azert\\Desktop\\Study ENSET\\S3\\JAVA\\stuff\\TP ES\\EX1");

        File[] files = directoryPath.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String access = "";

                if (file.canRead()) {
                    access += "r";
                    } else {
                    access += "-";
                }

                if (file.canWrite()) {
                    access += "w";
                    } else {
                    access += "-";
                    }

                if (file.canExecute()) {
                    access += "x";
                    } else {
                    access += "-";
                    }

                if (file.isHidden() || file.getName().startsWith(".")) {
                    access += "h";
                } else {
                    access += "-";
                    }

                System.out.println(file.getAbsolutePath() + " <FILE> " + access);

            } else if (file.isDirectory()) {
                recDirectory(file);
            }
        }
    }


}
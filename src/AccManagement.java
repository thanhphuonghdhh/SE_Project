import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AccManagement {
    AccList accList = new AccList();
    public AccManagement() {this.insertFromFile();}

    public void insertFromFile() {
        try {
            File inFile = new File("acc.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] lineSplit = line.split(",");
                int a = Integer.parseInt(lineSplit[0]);
                int b = Integer.parseInt(lineSplit[2]);
                int c = Integer.parseInt(lineSplit[4]);
                accList.push(new Account(a,lineSplit[1],b,lineSplit[3],c));
                System.out.println("1");
            }
            reader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int searchPass(int ID) {
        return accList.searchID(ID);
    }

    public static void main(String[] args) {
       AccManagement accManagement = new AccManagement();
        System.out.println(accManagement.accList.searchID(1));
    }
}

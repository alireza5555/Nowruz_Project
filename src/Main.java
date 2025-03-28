import java.util.ArrayList;
import db.*;
import example.Human;

public class Main {
    public static void main(String[] args) {
        Human ali = new Human("Ali");
        try {
            Database.add(ali);
        }
        catch (Exception e){
            System.out.println("Fuck");
        }
        ali.name = "Ali Hosseini";

        int aliId = ali.id;

        Human aliFromTheDatabase = null;
        try {
            aliFromTheDatabase    = (Human) Database.get(aliId);
        }
        catch (Exception e){
            System.out.println("Fuck");
        }

        System.out.println("ali's name in the database: " + aliFromTheDatabase.name);
    }
}
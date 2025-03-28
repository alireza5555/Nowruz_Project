import java.util.ArrayList;
import db.*;
import db.exception.InvalidEntityException;
import example.Human;
import example.HumanValidator;


public class Main {
    public static void main(String[] args) throws InvalidEntityException, CloneNotSupportedException {
        Database.registerValidator(Human.HUMAN_ENTITY_CODE, new HumanValidator());

        Human ali = new Human("Ali", -10);
        Database.add(ali);
    }
}
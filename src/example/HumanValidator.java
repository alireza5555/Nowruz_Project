package example;

import db.*;
import db.exception.InvalidEntityException;
import db.exception.InvalidEntityException;

public class HumanValidator implements Validator {
    @Override
    public void validate(Entity entity) throws InvalidEntityException {
        if (!(entity instanceof Human)) {
            throw new IllegalArgumentException();
        }

        if (((Human) entity).age < 0) {
            throw new InvalidEntityException("Age must be positive");
        }
        if (((Human) entity).name.isEmpty()) {
            throw new InvalidEntityException("Human must have a name");
        }

    }
}
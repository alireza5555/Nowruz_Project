package db;

import java.util.Date;

public abstract class Entity implements Cloneable  {
    public int id;
    protected Date creationDate;
    protected Date lastModificationDate;
    @Override
    public Entity clone() throws CloneNotSupportedException{
        return (Entity) super.clone();
    }

    public abstract int getEntityCode();
}



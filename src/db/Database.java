package db;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Entity> entities = new ArrayList<>();
    private static int num = 1;

    public static void add(Entity e){
        e.id = num;
        num++;
        entities.add(e);
    }

    public static Entity get (int id){
        for (Entity temp : entities){
            if(temp.id == id){
                return temp;
            }
        }
        throw new EntityNotFoundException();
    }

    public static void delete(int id){
        for (int i = 0 ; i < entities.size() ; i++){
            if(entities.get(i).id == id){
                entities.remove(i);
                return;
            }
        }
        throw new EntityNotFoundException();
    }

    public static void update(Entity e){
        for (int i = 0 ; i < entities.size() ; i++){
            if(entities.get(i).id == e.id){
                entities.set(i , e);
                return;
            }
            throw new EntityNotFoundException();
        }
    }
}

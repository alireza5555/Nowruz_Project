package db;

import db.exception.EntityNotFoundException;
import java.util.HashMap;
import java.util.ArrayList;

public class Database {
    private static ArrayList<Entity> entities = new ArrayList<>();
    private static int num = 1;
    private static HashMap<Integer, Validator> validators;

    public static void add(Entity e) throws CloneNotSupportedException{
        e.id = num;
        num++;
        entities.add(e.clone());
    }

    public static Entity get (int id) throws CloneNotSupportedException {
        for (Entity temp : entities){
            if(temp.id == id){
                return temp.clone();
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

    public static void update(Entity e) throws CloneNotSupportedException{
        for (int i = 0 ; i < entities.size() ; i++){
            if(entities.get(i).id == e.id){
                entities.set(i , e.clone());
                return;
            }
            throw new EntityNotFoundException();
        }
    }
}

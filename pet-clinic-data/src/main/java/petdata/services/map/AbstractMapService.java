package petdata.services.map;

import petdata.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<Type extends BaseEntity, ID extends Long> {

    protected Map<Long, Type> map = new HashMap<>();

    Set<Type> findAll(){
        return new HashSet<>(map.values());
    }

    Type findById(ID id){
        return map.get(id);
    }

    Type save(Type object){
        if(object !=null ) {
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(Type object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){

        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;

        }catch(NoSuchElementException e){
            nextId = 1L;
        }

        return nextId;
    }
}

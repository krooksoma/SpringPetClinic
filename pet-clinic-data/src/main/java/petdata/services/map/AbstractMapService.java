package petdata.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<Type, ID> {

    protected Map<ID, Type> map = new HashMap<>();

    protected Set<Type> findAll(){
        return new HashSet<>(map.values());
    }

    protected Type findById(ID id){
        return map.get(id);
    }

    protected Type save(ID id, Type object){
        map.put(id, object);
        return object;
    }

    protected void deleteById(ID id){
        map.remove(id);
    }

    protected void delete(Type object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

}

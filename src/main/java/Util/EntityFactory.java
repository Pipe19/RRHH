package Util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

public class EntityFactory {
    protected static  EntityManager ENTITY_MANAGER;
    public static EntityManager getEntityManager(){
        if(ENTITY_MANAGER == null)
            ENTITY_MANAGER = Persistence.createEntityManagerFactory("rrhh").createEntityManager();
        return ENTITY_MANAGER;
    }
    public static CriteriaBuilder getCriteriaBuilder(){
        getEntityManager();
        return ENTITY_MANAGER.getCriteriaBuilder();
    }
}

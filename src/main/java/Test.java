import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Test {
    private static EntityManager entityManager;
    public static void main(String[] args) {
        entityManager = Persistence.createEntityManagerFactory("rrhh").createEntityManager();;

    }
}

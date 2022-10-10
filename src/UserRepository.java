
import java.util.List;

public interface UserRepository {
    User create(User user);
    User read(Long mobile);
    User update(User user);
    void delete(Long mobile);

    List<User> findAll();
    List<User>findByName(Long name);
}

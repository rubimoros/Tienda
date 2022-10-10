import java.util.ArrayList;
import java.util.List;


public class MemUserRepository implements UserRepository{

    private ArrayList<User> users;
    private int cantidadUsuarios = 0;
    @Override
    public User create(User user) {
        if(users.contains(user)){
            return null;
        }
        users.add(user);
        cantidadUsuarios++;
        return user;
      /*  for (User i: users){
            if(null== i) {
                users.add(user);
                cantidadUsuarios++;
                return user;
            }
            else{
                users.add(user);
                cantidadUsuarios++;
                return user;
            }

        }
        */
    }

    @Override
    public User read(Long mobile){
        int index = this.users.indexOf(new User(mobile),null,null);
        if(index != -1)
            return this.users.get(index);
        else
            return null;
    }

    @Override
    public User update(User user) {
       int index = this.users.indexOf(new User(user.getMobile(), null,null));
       if(index != -1){
           this.users.get(index).setName(user.getName());
           this.users.get(index).setAddress(user.getAddress());
           return this.users.get(index);
       }
       else {
           return null;
       }
    }

    @Override
    public void delete(Long mobile) {
        users.remove(read(mobile));
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByName(Long name) {
        return null;
    }
}

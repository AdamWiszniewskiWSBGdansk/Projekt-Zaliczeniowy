package Hondana.Hondana.Service;

import Hondana.Hondana.Model.User;
import Hondana.Hondana.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    //Dodanie usera
    public void addUser(User user) {userRepository.save(user);}

    //Zmiana istniejącego usera
    public void updateUser(User user) {userRepository.save(user);}

    //Usunięcie wszystkich userów
    public void deleteUser(User user) {userRepository.delete(user);}

    //Usunięcie istniejącego usera po Id
    public void deleteUserById(long user) {userRepository.deleteById(user);}
}

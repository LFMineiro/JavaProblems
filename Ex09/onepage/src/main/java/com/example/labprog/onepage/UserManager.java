package com.example.labprog.onepage;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;

    public UserManager() {
        ArrayList<String> lines =                               FileManager.readFromFile("files/users.csv");
        for(int i=0; i<lines.size(); i++) {
            String line = lines.get(i);
            String[] values = line.split(",");
            
            User user = new User(
                Integer.parseInt(values[0]),
                values[1],
                values[2],
                values[3],
                values[4]
            );
            users.add(user);
        }

    }

    public ArrayList<User> getAll() {
        return users;
    }

    public User getUserById(Integer id) {

        for(User u: users) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }


}

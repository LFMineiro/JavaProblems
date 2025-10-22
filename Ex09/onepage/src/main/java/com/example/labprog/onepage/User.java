package com.example.labprog.onepage;

public class User {
    private static final String BASE_URL = "http://localhost:8080/users/";    
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;
    private String url;
    
    public User(Integer id, String email, String firstName, String lastName, String avatar) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.url = generateUrl(id);
    }

    public String generateUrl(Integer id) {
        return BASE_URL + id;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
        this.url = generateUrl(id); // Atualiza o URL quando o ID muda
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getUrl() {
        return url;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

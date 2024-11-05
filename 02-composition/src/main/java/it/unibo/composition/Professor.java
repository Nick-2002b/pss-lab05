package it.unibo.composition;

public class Professor implements User{
    private final int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;
    
    Professor(int id, String name, String surname, String password){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }


    
    public String getUsername() {
        return this.name;
    }

    
    public String getPassword() {
        return this.password;
    }

    
    public String getDescription() {
        return null;
    }
    
}

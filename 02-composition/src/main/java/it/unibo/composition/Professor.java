package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User{
    private static final String DOT = ".";
    private final int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;
    
    Professor(int id, String name, String surname, String password, String[] cours){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = cours;
    }

    public void replaceCourse(String cours, int index){
        
    }
    
    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    
    public String getPassword() {
        return this.password;
    }

    public String toString(){
        return "Professor [" 
        + "name= " + this.name 
        + ", surname= " + this.surname 
        + ", id=" + this.id
        + ", subjects=" + Arrays.toString(this.courses)
        + "]";
    }

    
    public String getDescription() {
        return this.toString();
    }
    
}

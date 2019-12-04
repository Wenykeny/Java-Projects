/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boytest;

/**
 *
 * @author moisessuquila
 */
public class Boy {
    private int ID;
    private String name;
    private String surname;
    private String phone;

    public Boy(int ID, String name, String surname, String phone) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
    
    public String toString(){
        return "ID: "+ getID() + ", Name: "+ getName() + ", Surname: "+getSurname() +" and phone: "+getPhone();
    }

    public int getID() {
        return ID;
    }
    
    public void setSurname(String sur){
        this.surname = sur;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }
}

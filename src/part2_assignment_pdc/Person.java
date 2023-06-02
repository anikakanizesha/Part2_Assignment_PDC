/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_assignment_pdc;

/**
 *
 * @author anika
 */
public class Person  {
    
    private String name;
    private int customerAge;
    private String customerAddress;
    
    public Person(){
    }
    
    public Person(String name, int customer_age, String customer_address)
    {
        this.name = name;
        this.customerAge = customer_age;
        this.customerAddress = customer_address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public int getCustomerAge(){
        return this.customerAge;
        
    }
    public void setCustomerAge(int customerAge){
        this.customerAge = customerAge;
    }
    
    
    
    
}


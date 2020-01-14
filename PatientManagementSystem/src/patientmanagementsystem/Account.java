/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;


/**
 *
 * @author cex
 */
public class Account 
{
    private int permissions;
    private int accountNum;
    private String name;
    private String address;
    private String sex;
    private int age;
        
    public static class Builder
    {
        private final int permissions;
        private final int accountNum;
        private String name; 
        private String address;
        private String sex = "";
        private int age = -1;
        
        public Builder(int permissions)
        {
            this.accountNum = (int) (Math.random() * 1000 + 1);
            this.permissions = permissions;
        }
        public Builder addName(String name)
        {
            this.name = name;
            return this;
        }
        public Builder addAddress(String address)
        {
            this.address = address;
            return this;
        }
        public Builder addSex(String sex)
        {
            this.sex = sex;
            return this;
        }
        public Builder addAge(int age)
        {
            this.age = age;
            return this;
        }
        public Account build(){
            return new Account(this);
        }
    }
    
    private Account(Builder builder)
    {
        this.permissions = builder.permissions;
        this.accountNum = builder.accountNum;
        this.name = builder.name;
        this.address = builder.address;
        this.sex = builder.sex;
        this.age = builder.age;
    }
    public int getPermissions(){
        return this.permissions;
    }
    public int getaccNumber() {
        return this.accountNum;
    }
    public String getName() {
        return this.name;
    }
    public String getaddress() {
        return this.address;
    }
    public String getSex() {
        return this.sex;
    }
    public int getAge() {
        return this.age;
    }
}

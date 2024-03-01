package employee.registration.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@ToString
@Getter
@Setter
@Entity
@Table(name = "users",schema="riya")
public class User {


    @Column(name="employeeno")
    @Id
    private int employeeno;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="department")
    private String department;

    @Column(name="address")
    private String address;

    @Column(name="designation")
    private String designation;

    @Column(name="gender")
    private String gender;

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Column(name = "dateofbirth")
    private LocalDate dateofbirth;


    /*public int getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(int employeeno) {
        this.employeeno = employeeno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }*/


}

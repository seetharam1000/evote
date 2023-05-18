package com.voting.vote.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Data
@DynamicUpdate
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"mobileNo", "aadharNo", "registrationNo"})})
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;
    @Column(name = "username")
    public String username;
//    @Column(name = "password")
//    public String password;
    @Column(name = "mobileNo", unique = true)
    public String mobileNo;
    @Column(name = "aadharNo", unique = true)
    public String aadharNo;
    @Column(name = "registrationNo", unique = true)
    public String registrationNo;
    @Column(name = "category")
    public String category;
    @Column(name = "voteStatus")
    public String voteStatus;
    @Column(name = "completed")
    public String completed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVoteStatus() {
        return voteStatus;
    }

    public void setVoteStatus(String voteStatus) {
        this.voteStatus = voteStatus;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}

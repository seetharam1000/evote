package com.voting.vote.repo;

import com.voting.vote.model.Count;
import com.voting.vote.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    public Optional<Users> findByAadharNoOrRegistrationNo(String aadharNo, String registerNo);

    @Modifying
    @Query("Update Users t SET t.completed=:completed")
    int completedResult(@Param("completed") String completed);

}

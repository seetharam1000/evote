package com.voting.vote.evoteinterfaces;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.voting.vote.evotedaoimpl.Evote_Interface;
import com.voting.vote.model.Users;
import com.voting.vote.repo.UserRepo;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Service
public class Evote_Impl implements Evote_Interface {

    @Autowired
    UserRepo userRepo;


    @Override
    public Optional<Users> loginDetails(String aadharNoOrRegisterNo) {

        return userRepo.findByAadharNoOrRegistrationNo(aadharNoOrRegisterNo, aadharNoOrRegisterNo).or(() -> Optional.of(new Users()));
    }

    @Override
    public Boolean registerDetails(Users users) {

        return registerCondition.test(users);
    }

    public Predicate<Users> registerCondition = new Predicate<Users>() {
        @Override
        public boolean test(Users users) {
            if ((userRepo.findByAadharNoOrRegistrationNo(users.getAadharNo(), users.getRegistrationNo()).isEmpty())) {
                return userRepo.save(users).getId() > 0;
            }
            return false;
        }
    };

    @Override
    public Users userVoting(Users usersVote) {

        Optional<Users> users = userRepo.findById(usersVote.getId());
        users.get().setVoteStatus(usersVote.getVoteStatus());
        users.get().setCompleted("1");
        return userRepo.save(users.get());
    }

    @Override
    public List<Users> result() {

        return userRepo.findAll();
    }

    @Transactional
    @Override
    public int completed() {

        return userRepo.completedResult("1");
    }
}

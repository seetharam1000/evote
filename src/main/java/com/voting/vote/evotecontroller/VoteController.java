package com.voting.vote.evotecontroller;

import com.google.gson.JsonObject;
import com.voting.vote.evotedaoimpl.Evote_Interface;
import com.voting.vote.model.Users;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/evote")
public class VoteController {

    @Autowired
    private Evote_Interface evoteInterface;

    @GetMapping("/login/{aadharNoOrRegisterNo}")
    public Optional<Users> login(@PathVariable String aadharNoOrRegisterNo) {

        return evoteInterface.loginDetails(aadharNoOrRegisterNo);
    }

    @PostMapping("/register")
    public Boolean register(@RequestBody Users users) {

        return evoteInterface.registerDetails(users);
    }

    @PutMapping("/userVoting")
    public Users userVoting(@RequestBody Users users) {

        return evoteInterface.userVoting(users);
    }

    @GetMapping("/result")
    public List<Users> result() {

        return evoteInterface.result();
    }

    @PutMapping("/completed")
    public int completed() {

        return evoteInterface.completed();
    }
}

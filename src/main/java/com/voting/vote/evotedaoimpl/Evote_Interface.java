package com.voting.vote.evotedaoimpl;

import com.google.gson.JsonObject;
import com.voting.vote.model.Users;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Evote_Interface {
    Optional<Users> loginDetails(String aadharNoOrRegisterNo);

    Boolean registerDetails(Users users);

    Users userVoting(Users users);

    List<Users> result();

    int completed();
}

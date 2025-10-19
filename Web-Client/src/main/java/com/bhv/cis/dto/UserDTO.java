package com.bhv.cis.dto;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class UserDTO {

    private String id;
    private String userName;
    private Name name;
    private String displayName;
    private String userType;
    private boolean active;
    private List<Email> emails;
    private List<Group> groups;

    @Data
    public static class Name {
        private String familyName;
        private String givenName;
    }

    @Data
    public static class Email {
        private String value;
        private boolean primary;
    }

    @Data
    public static class Group {
        private String value;
        private String display;

        @JsonProperty("$ref")
        private String ref;
    }
}

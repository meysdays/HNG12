package com.example.restapi.entity;

public class Response {
    public String email;
    public String current_datetime;
    public String github_url;

    public Response(String email, String current_datetime, String github_url) {
        this.email = email;
        this.current_datetime = current_datetime;
        this.github_url = github_url;
    }
}

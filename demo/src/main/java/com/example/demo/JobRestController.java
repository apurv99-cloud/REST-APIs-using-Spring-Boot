package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobPost;
import com.example.demo.service.JobService;

// @Controller
@RestController

// @CrossOrigin(origins = "frontend URL")
// If you're using RestController you don't need a response body
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    // @ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        // return service.getJob

    }

    public void updateJob(@RequestBody JobPost jobpost){
        return service.updateJob(jobpost);
    }

}

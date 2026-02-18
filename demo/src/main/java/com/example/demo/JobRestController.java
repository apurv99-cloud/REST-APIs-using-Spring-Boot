package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.JobPost;
import com.example.demo.service.JobService;
import org.springframework.web.bind.annotation.PutMapping;

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

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);

    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return jobPost;
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Deleted";

    }

    // @PostMapping("jobPost")
    // public JobPost addJob(@RequestBody JobPost jobPost) {
    // service.addJob(jobPost);
    // // return service.getJob

    // }

    // public void updateJob(@RequestBody JobPost jobpost){
    // return service.updateJob(jobpost);
    // }

}

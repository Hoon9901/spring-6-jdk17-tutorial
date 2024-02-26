package com.hoon.boot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn SpringBoot", "hoon"),
                new Course(2, "Learn K8s", "hoon"),
                new Course(3, "Learn AWS", "hoon"),
                new Course(4, "how to goal toss?", "hoon")
        );
    }

    @RequestMapping("/courses/1")
    public Course getCourse() {
        return new Course(1, "Learn SpringBoot", "hoon");
    }

}

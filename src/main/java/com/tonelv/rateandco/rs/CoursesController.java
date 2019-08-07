package com.tonelv.rateandco.rs;

import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.repositories.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CoursesController {

    private CourseRepository courseRepository;

    //GetAll
    @GetMapping("/courses")
    public ArrayList<Course> GetCourses()
    {
        courseRepository = new CourseRepository();
        return courseRepository.GetAll();
    }

    //Create
    @PostMapping("/courses")
    public Course PostCourse(@RequestBody Course course)
    {
        return course;
    }

    //GetById

    //Update

    //Delete


}

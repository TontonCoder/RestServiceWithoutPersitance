package com.tonelv.rateandco.rs;

import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.repositories.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
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
    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public ResponseEntity<Course> PostCourse(@RequestBody Course course)
    {
        if(course != null)
        {
            System.out.println("Course value entered:"+course.toString());
            courseRepository.Create(course);
            return ResponseEntity.ok(course);
        }
        return null;
    }

    //GetById
    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> GetCourseById(@RequestParam Integer id)
    {
        Course course = courseRepository.Get(id);
        if(course != null)
        {
            return ResponseEntity.ok(course);
        }
        return null;
    }

    //Update

    //Delete
    @RequestMapping(value="/courses/{id}", method = RequestMethod.DELETE)
    public String DeleteCourse(@PathVariable("id") int id)
    {
        courseRepository.Delete(id);
        return "Id to delete ="+id;
    }


}

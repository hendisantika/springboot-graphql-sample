package com.hendisantika.springbootgraphqlsample.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.hendisantika.springbootgraphqlsample.model.Student;
import com.hendisantika.springbootgraphqlsample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/01/20
 * Time: 06.17
 */
@Component
public class StudentMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private StudentService studentService;

    public Student createStudent(Student student) {
        return studentService.createStudentRecord(student);
    }
}
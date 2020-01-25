package com.hendisantika.springbootgraphqlsample.service;

import com.hendisantika.springbootgraphqlsample.model.Student;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-graphql-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/01/20
 * Time: 06.15
 */
public interface StudentService {
    Student getStudentDetailsByName(String name);

    Student createStudentRecord(Student student);
}

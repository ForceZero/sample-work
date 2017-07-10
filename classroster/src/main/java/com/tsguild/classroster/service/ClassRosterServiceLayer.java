/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.classroster.service;

import com.tsguild.classroster.dao.ClassRosterPersistenceException;
import com.tsguild.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Bruce_Breslin
 */
public interface ClassRosterServiceLayer {
    
    void createStudent(Student student)throws ClassRosterDuplicateIdException,ClassRosterDataValidationException,ClassRosterPersistenceException;
    
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}
package com.example.student4.mulduleSubjects.Service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.student4.mulduleSubjects.Model.Subject;
import com.example.student4.mulduleSubjects.Repository.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SubjectServiceImplement.class})
@ExtendWith(SpringExtension.class)
class SubjectServiceImplementTest {
    @MockBean
    private SubjectRepository subjectRepository;

    @Autowired
    private SubjectServiceImplement subjectServiceImplement;

    /**
     * Method under test: {@link SubjectServiceImplement#getAllSubject()}
     */
    @Test
    void testGetAllSubject() {
        ArrayList<Subject> subjectList = new ArrayList<>();
        when(subjectRepository.findAll()).thenReturn(subjectList);
        List<Subject> actualAllSubject = subjectServiceImplement.getAllSubject();
        assertSame(subjectList, actualAllSubject);
        assertTrue(actualAllSubject.isEmpty());
        verify(subjectRepository).findAll();
    }

    /**
     * Method under test: {@link SubjectServiceImplement#getAllSubject()}
     */
    @Test
    void testGetAllSubject2() {
        ArrayList<Subject> subjectList = new ArrayList<>();
        when(subjectRepository.findAll()).thenReturn(subjectList);
        List<Subject> actualAllSubject = subjectServiceImplement.getAllSubject();
        assertSame(subjectList, actualAllSubject);
        assertTrue(actualAllSubject.isEmpty());
        verify(subjectRepository).findAll();
    }
}


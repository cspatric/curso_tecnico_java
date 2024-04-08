package com.meuprojeto;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.mockito.Mockito;

public class StudentControllerTest {

    @Test
    public void testShowSignUpForm() {
        StudentController controller = new StudentController();
        String viewName = controller.showSignUpForm(new Student());
        assertEquals("add-student", viewName);
    }

    @Test
    public void testAddStudent() {
        StudentController controller = new StudentController();
        BindingResult result = Mockito.mock(BindingResult.class);
        Mockito.when(result.hasErrors()).thenReturn(false);
        String viewName = controller.addStudent(new Student(), result, Mockito.mock(Model.class));
        assertEquals("redirect:list", viewName);
    }

    @Test
    public void testUpdateStudent() {
        StudentController controller = new StudentController();
        BindingResult result = Mockito.mock(BindingResult.class);
        Mockito.when(result.hasErrors()).thenReturn(false);
        String viewName = controller.updateStudent(1L, new Student(), result, Mockito.mock(Model.class));
        assertEquals("index", viewName);
    }

    @Test
    public void testDeleteStudent() {
        StudentController controller = new StudentController();
        String viewName = controller.deleteStudent(1L, Mockito.mock(Model.class));
        assertEquals("index", viewName);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTeacherTest {

    @Test
    void DeveRetornarNomeProfessor() {
        ClassTeacher.getInstance().setNameTeacher("Guilherme Marques");
        assertEquals("Guilherme Marques", ClassTeacher.getInstance().getNameTeacher());
    }

    @Test
    void DeveRetornarCapacidadeDaSala() {
        ClassTeacher.getInstance().setNameClass("Aspectos avançados em Engenharia de Sofware");
        assertEquals("Aspectos avançados em Engenharia de Sofware", ClassTeacher.getInstance().getNameClass());
    }
}
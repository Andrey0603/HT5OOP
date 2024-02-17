
import java.util.List;
// Малинин Андрей

// — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
// — Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
// — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
// — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.


public class Main {
    
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1);
        Teacher teacher2 = new Teacher(2);
        List<Teacher> teachers = List.of(teacher1, teacher2);
        
        List<Student> students = List.of(new Student(101), new Student(102), new Student(103));
        
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);
        
        StudyGroup studyGroup = controller.createStudyGroup(teacher1, students);
        
        System.out.println("Учебная группа с преподавателем ID " + studyGroup.getTeacher().getId() + " и студентами:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("Студент с ID " + student.getId());
        }

        // Вывод преподавателей и студентов по их ID
        controller.outputTeachersById(teachers, 1);
        controller.outputStudentsById(students, 102);
    }
}
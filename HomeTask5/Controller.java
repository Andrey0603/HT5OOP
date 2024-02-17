import java.util.List;

class Controller {
    
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }
    
    // Метод для создания учебной группы
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.formStudyGroup(teacher, students);
    }

    // Метод для вывода преподавателей по их ID
    public void outputTeachersById(List<Teacher> teachers, int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                System.out.println("Преподаватель с ID " + id);
            }
        }
    }

    // Метод для вывода студентов по их ID
    public void outputStudentsById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Студент с ID " + id);
            }
        }
    }
}


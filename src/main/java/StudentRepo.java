import java.util.*;

public class StudentRepo {

    private final Map<String, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public Student save(Student student) {
        students.put(student.id(), student);
        return student;
    }

    public Optional<Student> findStudentById(String id) throws StudentNotFoundException {
        Optional<Student> checkStudent = Optional.ofNullable(students.get(id));

        if (checkStudent.isEmpty()) {
            throw new StudentNotFoundException(id);
        }

        return Optional.ofNullable(students.get(id));
    }
}

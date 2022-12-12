 public class Main {
        public static void main(String[] args) {
            Course mat=new Course ("Matematik","MAT101","MAT");
            Course fizik=new Course("Fizik","FZK101","FZK");
            Course kimya=new Course("Kimya","KMY101","KMY");

            Teacher t1=new Teacher("Mahmut","115202022","MAT");
            Teacher t2=new Teacher("Fatma Ayşe","117202044","FZK");
            Teacher t3=new Teacher("Ali Veli","114330055","KMY");

            mat.addTeacher(t1);
            fizik.addTeacher(t2);
            kimya.addTeacher(t3);

              Student s1=new Student("Şaban",4,"14038052",mat,fizik,kimya);
              s1.addBulkExamNote(50,20,40);
              s1.isPass();
              Student s2=new Student("Güdük Necmi",4,"14058033",mat,fizik,kimya);
              s2.addBulkExamNote(100,50,40);
              s2.isPass();
            Student s3=new Student("Hayta İsmail",4,"14058045",mat,fizik,kimya);
            s3.addBulkExamNote(50,20,40);
            s3.isPass();


        }
    }



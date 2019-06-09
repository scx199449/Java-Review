package Test01;

import java.text.SimpleDateFormat;

//管理系统类
public class Manager {
    Student[] students;//存放学生对象数组

    /**
     * 入学开户
     */
    public void createStudent(Student stu){
        if (this.students == null){
            this.students = new Student[1];
            this.students[0] = stu;
        }else{
            int len = this.students.length + 1;
            Student temp[] = this.students;
            this.students = new Student[len];
            for (int i = 0;i < temp.length;i++){
                this.students[i] = temp[i];
            }
            this.students[len-1] = stu;
        }

    }

    /**
     * 查询学生信息
     */
    public void findStudentInfo(Integer id){
       for (int i = 0;i < this.students.length;i++){
           if (this.students[i].getId() == id){
               System.out.println("学号为:"+id+"的信息是:"+this.students[i].toString());
           }else{
               System.out.println("没有找到指定学生信息,请重新输入");
           }
       }
    }

    /**
     * 查询学生是否毕业
     */
    public boolean isGraduation(Integer id){
        String time = "";
        for (int i = 0;i < this.students.length;i++){
            if (this.students[i].getId() == id){
                time = this.students[i].getBirthday();
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");

         return false;
    }

    /**
     * 销户
     */
    public void destroyStudent(Integer id){

    }

    /**
     * 判断两个学生是否是同一个班级
     */
    public boolean isSameClass(Integer id1,Integer id2){
      return false;
    }

    /**
     * 判断那些班级有同名的学生
     */
    public String[] haveSameNameStudent(){
        String classes[] = new String[1];
       return classes;
    }
}

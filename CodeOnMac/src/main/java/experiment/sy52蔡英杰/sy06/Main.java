package main.java.experiment.sy52蔡英杰.sy06;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static int menu(Scanner scanner) {
        int choice = -1;
        System.out.printf("\n");
        System.out.printf("\t\t\t  学生信息管理系统功能菜单       \n");
        System.out.printf("\t\t\t  =======================    \n");
        System.out.printf("\t\t\t  1.插入学生信息记录        \n");
        System.out.printf("\t\t\t  2.删除学生信息记录        \n");
        System.out.printf("\t\t\t  3.更新学生信息记录        \n");
        System.out.printf("\t\t\t  4.显示所有学生信息记录       \n");
        System.out.printf("\t\t\t  5.按学号查询指定学生信息      \n");
        System.out.printf("\t\t\t  0.结束程序               \n");
        System.out.printf("\t\t\t  =======================    \n");
        System.out.printf("\t\t\t  请输入您的选择：               \n");
        choice = scanner.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        int menuChoice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            menuChoice = menu(scanner);
            switch (menuChoice) {
                // 插入学生信息记录
                case 1: {
                    insertStudent(list);
                    break;
                }
                // 删除学生信息记录
                case 2: {
                    deleteStudent(list);
                    break;
                }
                // 修改更新学生信息记录
                case 3: {
                    updateStudent(list);
                    break;
                }
                // 显示所有学生信息记录
                case 4: {
                    displayAllStudent(list);
                    break;
                }
                // 按学号查询指定学生信息
                case 5: {
                    findStudentBySno(list);
                    break;
                }
            }
        } while (menuChoice != 0);
        scanner.close();
    }

    //插入学生信息
    public static void insertStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的学号:");
        String sno = scanner.next();

        System.out.println("请输入学生的姓名:");
        String sname = scanner.next();

        System.out.println("请输入学生的部门:");
        String sdept = scanner.next();

        Student s = new Student(sno, sname, sdept);

        list.add(s);
        System.out.println("学生信息添加成功");
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生的学号:");
        String sno=scanner.next();
        int index=getIndex(list,sno);
        if(index==-1) {
            System.out.println("学号不存在，删除失败");
        }else{
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    //更改学生信息
    public static void updateStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生的学号:");
        String sno=scanner.next();
        int index=getIndex(list,sno);
        if(index==-1){
            System.out.println("学号不存在");
            return;
        }
        Student s=list.get(index);
        System.out.println("请输入要修改的学生姓名");
        String newname=scanner.next();
        s.setSname(newname);
        System.out.println("请输入要修改的学生部门");
        String newdept=scanner.next();
        s.setSname(newdept);
        System.out.println("学生信息修改成功");
    }

    //显示所有学生信息
    public static void displayAllStudent(ArrayList<Student> list) {
        System.out.println("学号\t姓名\t部门");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getSno() + "\t" + s.getSname() + "\t" + s.getSdept());
        }
    }

    //按学号查询指定学生信息
    public static void findStudentBySno(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的学生的学号:");
        String sno=scanner.next();
        int index=getIndex(list,sno);
        if(index==-1){
            System.out.println("学号不存在");
            return;
        }else{
            Student s=list.get(index);
            System.out.println(s.getSno() + "\t" + s.getSname() + "\t" + s.getSdept());
        }
    }

    //通过学号获取索引
    public static int getIndex(ArrayList<Student> list,String sno){
        for(int i=0;i<list.size();i++){
            Student s=list.get(i);
            String no=s.getSno();
            if(no==sno)
                return i;
        }
        return -1;
    }
}

class Student {
    private String sno;
    private String sname;
    private String sdept;

    public Student() {

    }

    public Student(String sno, String sname, String sdept) {
        this.sno = sno;
        this.sname = sname;
        this.sdept = sdept;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }
}

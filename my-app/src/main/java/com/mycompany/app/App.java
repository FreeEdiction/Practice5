package com.mycompany.app;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		new WorkWithStudents();
		Student testStudent = new Student("Roma Sokur", 5);
		worker.saveStudentToDb(testStudent);

		WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
		Teacher teacher = new Teacher();
		teacher.setFirstname("Yuriy");
		teacher.setLastname("Mytnyk");
		teacher.setCellphone("+380996576542");
		teacher = workWithTeacher.addTeacher(teacher);
		teacher.setBirthDate(new Date(0));
		workWithTeacher.saveTacher(teacher);
	}

}

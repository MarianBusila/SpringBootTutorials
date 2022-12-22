package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Staff doctor = context.getBean(Doctor.class);
        Staff nurse = context.getBean(Nurse.class);
        doctor.assist();
        nurse.assist();
    }
}

package scaler.assignment.models2tables;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Mapped Super Class
//import scaler.assignment.models2tables.mappedsuperclass.*;
//Single Table
//import scaler.assignment.models2tables.singletable.*;
//Table Per Class
//import scaler.assignment.models2tables.tableperclass.*;
//Joined
import scaler.assignment.models2tables.joined.*;

@SpringBootApplication
public class Models2tablesApplication implements CommandLineRunner {

	private UserRepository userRepository;
	private StudentRepository studentRepository;
	private MentorRepository mentorRepository;
	private TARepository taRepository;

	public Models2tablesApplication(
//			Mapped Super Class
//			@Qualifier("msc_student") StudentRepository studentRepository,
//			@Qualifier("msc_mentor") MentorRepository mentorRepository,
//			@Qualifier("msc_ta") TARepository taRepository
//			Single Table
//			@Qualifier("st_user") UserRepository userRepository,
//			@Qualifier("st_student") StudentRepository studentRepository,
//			@Qualifier("st_mentor") MentorRepository mentorRepository,
//			@Qualifier("st_ta") TARepository taRepository
//			Table Per Class
//			@Qualifier("tpc_user") UserRepository userRepository,
//			@Qualifier("tpc_student") StudentRepository studentRepository,
//			@Qualifier("tpc_mentor") MentorRepository mentorRepository,
//			@Qualifier("tpc_ta") TARepository taRepository
//			Joined
			@Qualifier("j_user") UserRepository userRepository,
			@Qualifier("j_student") StudentRepository studentRepository,
			@Qualifier("j_mentor") MentorRepository mentorRepository,
			@Qualifier("j_ta") TARepository taRepository
			) {
		this.userRepository = userRepository;
		this.studentRepository = studentRepository;
		this.mentorRepository = mentorRepository;
		this.taRepository = taRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Models2tablesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mapped Super Class
//		Student student = new Student();
//		student.setName("Akash");
//		student.setEmail("akashpenta8@gmail.com");
//		student.setPsp(98.9);
//		student.setAttendence(100);
//		studentRepository.save(student);
//
//		Mentor mentor = new Mentor();
//		mentor.setName("Sarath CH");
//		mentor.setEmail("sarath_ch@gmail.com");
//		mentor.setAvg_rating(4.5);
//		mentorRepository.save(mentor);
//
//		TA ta = new TA();
//		ta.setName("Hari S");
//		ta.setEmail("hari_s@gmail.com");
//		ta.setAvg_rating(4.4);
//		taRepository.save(ta);

//		Single Table
//		User user = new User();
//		user.setName("Akhil");
//		user.setEmail("akhil@gmail.com");
//		userRepository.save(user);
//
//		Student student = new Student();
//		student.setName("Akash");
//		student.setEmail("akashpenta8@gmail.com");
//		student.setPsp(98.9);
//		student.setAttendence(100);
//		studentRepository.save(student);
//
//		Mentor mentor = new Mentor();
//		mentor.setName("Sarath CH");
//		mentor.setEmail("sarath_ch@gmail.com");
//		mentor.setAvg_rating(4.5);
//		mentorRepository.save(mentor);
//
//		TA ta = new TA();
//		ta.setName("Hari S");
//		ta.setEmail("hari_s@gmail.com");
//		ta.setAvg_rating(4.4);
//		taRepository.save(ta);

//		Table Per Class
//		User user = new User();
//		user.setName("Akhil");
//		user.setEmail("akhil@gmail.com");
//		userRepository.save(user);
//
//		Student student = new Student();
//		student.setName("Akash");
//		student.setEmail("akashpenta8@gmail.com");
//		student.setPsp(98.9);
//		student.setAttendence(100);
//		studentRepository.save(student);
//
//		Mentor mentor = new Mentor();
//		mentor.setName("Sarath CH");
//		mentor.setEmail("sarath_ch@gmail.com");
//		mentor.setAvg_rating(4.5);
//		mentorRepository.save(mentor);
//
//		TA ta = new TA();
//		ta.setName("Hari S");
//		ta.setEmail("hari_s@gmail.com");
//		ta.setAvg_rating(4.4);
//		taRepository.save(ta);

//		Joined
		User user = new User();
		user.setName("Akhil");
		user.setEmail("akhil@gmail.com");
		userRepository.save(user);

		Student student = new Student();
		student.setName("Akash");
		student.setEmail("akashpenta8@gmail.com");
		student.setPsp(98.9);
		student.setAttendence(100);
		studentRepository.save(student);

		Mentor mentor = new Mentor();
		mentor.setName("Sarath CH");
		mentor.setEmail("sarath_ch@gmail.com");
		mentor.setAvg_rating(4.5);
		mentorRepository.save(mentor);

		TA ta = new TA();
		ta.setName("Hari S");
		ta.setEmail("hari_s@gmail.com");
		ta.setAvg_rating(4.4);
		taRepository.save(ta);
	}
}

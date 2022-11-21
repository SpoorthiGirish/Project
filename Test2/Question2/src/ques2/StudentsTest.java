package ques2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentsTest {

	public static void main(String[] args) {
		List<Students> stud = new ArrayList<>();
		stud.add(new Students("Spoorthi",97,"Java","Bengaluru"));
		stud.add(new Students("Karthik",83,"Java","Tumkur"));
		stud.add(new Students("Kundashree",33,"Java","Hassan"));
		stud.add(new Students("Rohan",87,"Java","Chandigarh"));
		stud.add(new Students("Kabir",51,"Java","Delhi"));
		stud.add(new Students("Shruthi",92,"Java","Chandigarh"));
		stud.add(new Students("Roshni",68,"Java","Hubli"));

	//find out students all the students from Chandigarh who scored more than 80% marks)
		List<String> freeDLprod = stud.stream()
		.filter( p->(p.address=="Chandigarh") && (p.marks>80))
		.map( p->p.name).collect(Collectors.toList());
		System.out.println("Students from Chandigarh who scored more than 80% marks are : ");
		System.out.println(freeDLprod);
		}



		}

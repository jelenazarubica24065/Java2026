package zadatak3_student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> nizStudenata = new ArrayList<Student>();
		Scanner u = new Scanner(System.in);

		System.out.println("Unesi prolaz na ispitu: ");
		Student.setProlazNaIspitu(u.nextFloat());

		System.out.println("Unesi broj studenata: ");
		int N = u.nextInt();

		System.out.println("Unesi studente (ime prezime indeks adresa bodovi): ");
		for (int i = 0; i < N; i++) {
			Student s = new Student(u.next(), u.next(), u.next(), u.next(), u.nextFloat());
			s.azurirajPolozioPolje();
			nizStudenata.add(s);
		}

		ArrayList<Student> polozili = Student.izdvojPoloziliIliNe(nizStudenata, 1);
		System.out.println("Polozili ispit: ");
		for (Student x : polozili) {
			x.stampajStudenta();
		}

		ArrayList<Student> istaUlica = Student.izdvojUlica(nizStudenata, "Studentska");
		System.out.println("Iz Studentske ulice: ");
		for (Student x : istaUlica) {
			x.stampajStudenta();
		}
		u.close();
	}

}

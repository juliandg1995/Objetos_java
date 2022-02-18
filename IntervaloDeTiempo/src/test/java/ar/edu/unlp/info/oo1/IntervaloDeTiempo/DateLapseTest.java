package ar.edu.unlp.info.oo1.IntervaloDeTiempo;
import java.time.format.DateTimeFormatter;
//import versionAlternativa.DateLapse;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import versionAlternativa.DateLapse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	
	private DateLapse aDateLapse;

	@BeforeEach
	void setUp() throws Exception {
//		this.aDateLapse = new DateLapse(LocalDate.parse("2021-05-25"), LocalDate.parse("2021-11-15"));
		this.aDateLapse = new DateLapse(LocalDate.parse("2021-05-25"), 174);
	}

	@Test
	void getFromTest() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		assertEquals("25-05-2021", aDateLapse.getFrom().format(formatter));
	}
	
	@Test
	void getToTest() {
		System.out.print(aDateLapse.sizeInDays());
		assertEquals(LocalDate.parse("2021-11-15"), aDateLapse.getTo());
	}
	
	@Test
	void sizeInDaysTest() {
		assertEquals(174, aDateLapse.sizeInDays());
	}
	
	@Test
	void includesDateTest() {
		assertTrue(aDateLapse.includesDate(LocalDate.parse("2021-09-08")));
		assertFalse(aDateLapse.includesDate(LocalDate.parse("2021-11-16")));
		assertFalse(aDateLapse.includesDate(LocalDate.parse("2021-05-24")));
	}
	
	

}

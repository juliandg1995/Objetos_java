package ar.edu.unlp.info.oo1.IntervaloDeTiempo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse() {
	}
	
	public DateLapse(LocalDate fromDate, LocalDate toDate) {
		this.from = fromDate;
		this.to = toDate;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}

	public int sizeInDays() {
		return (int)ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate otherDate) {
		return (from.isBefore(otherDate) && to.isAfter(otherDate))
			   || from.equals(otherDate)
			   || to.equals(otherDate);
	}
	
	public boolean overlaps(DateLapse otroDateLapse) {
		return this.includesDate(otroDateLapse.getFrom())
			   || this.includesDate(otroDateLapse.getTo())
			   || otroDateLapse.includesDate(this.getFrom())
			   || otroDateLapse.includesDate(this.getTo());
	}
	
	
}

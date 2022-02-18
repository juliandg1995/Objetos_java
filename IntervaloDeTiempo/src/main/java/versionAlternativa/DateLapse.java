package versionAlternativa;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
@SuppressWarnings("unused")

public class DateLapse {
	
	private LocalDate from;
	private int sizeinDays;
	
	public DateLapse() {
	}
	
	public DateLapse(LocalDate fromDate, int days) {
		this.from = fromDate;
		this.sizeinDays = days;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return from.plusDays(sizeinDays);
	}

	public int sizeInDays() {
		return this.sizeinDays;
	}
	
	public boolean includesDate(LocalDate otherDate) {
		return (from.isBefore(otherDate) && getTo().isAfter(otherDate))
			   || from.equals(otherDate)
			   || getTo().equals(otherDate);
	}
	
	public boolean overlaps(DateLapse otroDateLapse) {
		return this.includesDate(otroDateLapse.getFrom())
			   || this.includesDate(otroDateLapse.getTo())
			   || otroDateLapse.includesDate(this.getFrom())
			   || otroDateLapse.includesDate(this.getTo());
	}
	
}

package challenge;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="scripts")
public class Quote {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;

	private String actor;

	private String detail;

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getQuote() {
		return detail;
	}

	public void setQuote(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Quote{" +
				"actor='" + actor + '\'' +
				", detail='" + detail + '\'' +
				'}';
	}
}
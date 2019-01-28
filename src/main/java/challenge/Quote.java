package challenge;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name="scripts")
public class Quote {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;

	private Integer episode;

	@Column(name = "episode_name")
	private String episodeName;

	private String segment;

	private String type;

	private String actor;

	private String character;

	private String detail;

	@Column(name = "record_date")
	private LocalDate recordData;

	private String series;

	@Column(name = "transmission_date")
	private LocalDate transmissionDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEpisode() {
		return episode;
	}

	public void setEpisode(Integer episode) {
		this.episode = episode;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public void setEpisodeName(String episodeName) {
		this.episodeName = episodeName;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalDate getRecordData() {
		return recordData;
	}

	public void setRecordData(LocalDate recordData) {
		this.recordData = recordData;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public LocalDate getTransmissionDate() {
		return transmissionDate;
	}

	public void setTransmissionDate(LocalDate transmissionDate) {
		this.transmissionDate = transmissionDate;
	}

	public String getQuote() {
		return null;
	}

	public void setQuote(String quote) {

	}

	@Override
	public String toString() {
		return "Quote{" +
				"actor='" + actor + '\'' +
				", detail='" + detail + '\'' +
				'}';
	}
}

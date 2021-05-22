package kodlamaio.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_title")
public class JobTitle {
	@Id
	@GeneratedValue
	@Column(name="title_id")
	private int titleId;
	
	@Column(name="title_name")
	private String titleName;
	
	public JobTitle() {
		super();
	}

	public JobTitle(int titleId, String titleName) {
		super();
		this.titleId = titleId;
		this.titleName = titleName;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	
	
}

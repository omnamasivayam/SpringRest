package hello;

import java.util.Date;

public class Issue {

    private final String id;
    private final String desc;
	private final Date startDate;

    public Issue(String id, String desc, Date startDate) {
        this.id = id;
        this.desc = desc;
		this.startDate = startDate;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
	
	public Date getStartDate(){
		return startDate;
	}
}
package person;

public class PersonDetails{

    private final long id;
    private final int age;
	private final String details;
	
    public PersonDetails(long id, int age, String details) {
        this.id = id;
        this.age = age;
		this.details = details;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

	public String getDetails(){
		return details;
	}
}
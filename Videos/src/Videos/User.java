package Videos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

	private String name;
	private String surname;
	private Date registerDate;
	private int password;

	private List<Video> listVideo;
//CONSTRUCTOR

	public User() {

	}

	public User(String name, String surname, Date registerDate, int password) throws Exception {
		if (name == null)
			throw new Exception();
		if (surname == null)
			throw new Exception();
		if (registerDate == null)
			throw new Exception();
		if (password == 0)
			throw new Exception();

		this.name = name;
		this.surname = surname;
		this.registerDate = registerDate;
		this.password = password;

	}

//METODOS DE LA CLASE USER
	public void addVideo(Video video) throws Exception {

		List<Video> videoList = new ArrayList<>();
		videoList.add(video);

	}

	// setters

	public void setName(String name) {
		this.name = name;
	}

	public void setUrname(String surname) {
		this.surname = surname;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public void setPassword(Integer password) {
		this.password = password;

	}
	// getters

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public Date getregisterDate() {
		return this.registerDate;
	}

	public Integer getPassword() {
		return this.password;
	}

}
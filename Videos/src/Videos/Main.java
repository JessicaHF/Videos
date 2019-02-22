package Videos;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Video video = new Video("Maria");
		User user = new User();
		user.addVideo(video);

		System.out.println(" Salida:" + video.getTitle());

	}

}

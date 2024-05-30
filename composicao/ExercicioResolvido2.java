package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ExercicioResolvido2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment ("Have a nice trip");
		Comment c2 = new Comment("Wow that´s awesome");
		Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"),
				"Traveling to New Zeland",
				"Im going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		System.out.println(p1);
		
		System.out.println("----------------------------------");
		
		Comment c3 = new Comment ("good night");
		Comment c4 = new Comment("may the force be with you");
		Post p2 = new Post(sdf1.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		System.out.println(p2);
	}
}

package lesson21.movieapp;
import java.util.List;

/*
 * 1-film sınıfımız olsun
 * 2-yonetmen olsun
 * 3 film turlerimiz olsun 
 * 4-her filmin bir puanı olsun 
 * 5-her filmin oyuncuları olsun 
 * 6-her sınıfın kaydet guncelle sil metodları olsun 
 * 
 * 
 */
public class Test {

	public static void main(String[] args) {

		FilmManager filmManager = new FilmManager();

		CastManager castManager = new CastManager();

		Yonetmen yonetmen = new Yonetmen("Miyazaki", null);

		castManager.kayitEt(yonetmen);

		Film film = new Film("Ruhların kaçışı", List.of(ETur.ANİME, ETur.DRAMA), yonetmen);

		filmManager.kayitEt(film);

	}

}

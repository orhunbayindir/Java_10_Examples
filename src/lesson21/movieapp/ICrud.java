package lesson21.movieapp;

public interface ICrud<T> {

	T kayitEt(T t);

	void guncelle(T t);

	void sil(Long id);

}

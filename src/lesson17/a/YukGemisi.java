package lesson17.a;

public class YukGemisi extends Gemi implements IYuk {

	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName() + " yük alıyor ");

	}

	@Override
	public void yukBosalt() {
		System.out.println(getClass().getSimpleName() + " yük boşaltıyor ");

	}
}
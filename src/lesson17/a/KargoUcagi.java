package lesson17.a;

public class KargoUcagi extends Ucak implements IYuk {

	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName() + " yük alıyor ");

	}

	@Override
	public void yukBosalt() {
		System.out.println(getClass().getSimpleName() + " yük boşaltıyor ");

	}

}

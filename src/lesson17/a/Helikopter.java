package lesson17.a;

public class Helikopter extends Arac implements IHavaTasiti {

	@Override
	public void kalkisYap() {
		System.out.println(getClass().getSimpleName() + " kalkıs yapıyor");

	}

	@Override
	public void inisYap() {
		System.out.println(getClass().getSimpleName() + " inis  yapıyor");

	}

	@Override
	public void hizlanma() {
		// TODO Auto-generated method stub

	}

	@Override
	public void yavaslama() {
		// TODO Auto-generated method stub

	}

}

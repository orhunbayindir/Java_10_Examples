package lesson17;

public abstract class  Arac {

	
	private String marka;
	private String modelYılı;
	private String tur;
	
	public abstract void hizlanma();
	
	public abstract void yavaslama();

	public Arac(String marka, String modelYılı, String tur) {
		super();
		this.marka = marka;
		this.modelYılı = modelYılı;
		this.tur = tur;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModelYılı() {
		return modelYılı;
	}

	public void setModelYılı(String modelYılı) {
		this.modelYılı = modelYılı;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "Arac [marka=" + marka + ", modelYılı=" + modelYılı + ", tur=" + tur + "]";
	}

	public void yukBosalt() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

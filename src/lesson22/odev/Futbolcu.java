package lesson22.odev;


import java.util.Stack;



public class Futbolcu {

    private Boolean aktif;
	private String ad;
    private String mevki;
    private int numara;
	private int hiz;
	private int pas;
	private int topsurme;
	private int sut;
	private int passayisi;
	
	public Futbolcu(Boolean aktif, String ad, String mevki, int numara, int hiz, int pas, int topsurme, int sut,
			int passayisi) {
		super();
		this.aktif = aktif;
		this.ad = ad;
		this.mevki = mevki;
		this.numara = numara;
		this.hiz = hiz;
		this.pas = pas;
		this.topsurme = topsurme;
		this.sut = sut;
		this.passayisi = passayisi;
	}

	public Boolean getAktif() {
		return aktif;
	}

	public void setAktif(Boolean aktif) {
		this.aktif = aktif;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getMevki() {
		return mevki;
	}

	public void setMevki(String mevki) {
		this.mevki = mevki;
	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getPas() {
		return pas;
	}

	public void setPas(int pas) {
		this.pas = pas;
	}

	public int getTopsurme() {
		return topsurme;
	}

	public void setTopsurme(int topsurme) {
		this.topsurme = topsurme;
	}

	public int getSut() {
		return sut;
	}

	public void setSut(int sut) {
		this.sut = sut;
	}

	public int getPassayisi() {
		return passayisi;
	}

	public void setPassayisi(int passayisi) {
		this.passayisi = passayisi;
	}

	@Override
	public String toString() {
		return "Futbolcu [aktif=" + aktif + ", ad=" + ad + ", mevki=" + mevki + ", numara=" + numara + ", hiz=" + hiz
				+ ", pas=" + pas + ", topsurme=" + topsurme + ", sut=" + sut + ", passayisi=" + passayisi + "]";
	}
	


	







}

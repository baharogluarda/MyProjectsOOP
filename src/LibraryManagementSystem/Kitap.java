package LibraryManagementSystem;

public class Kitap {
    private String baslik;
    private String yazar;
    private String isbn;
    private int sayfaSayisi;

    public Kitap(String baslik, String yazar, String isbn, int sayfaSayisi){
        this.baslik = baslik;
        this.yazar = yazar;
        this.isbn = isbn;
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", isbn='" + isbn + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                '}';
    }
}

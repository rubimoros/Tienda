import java.math.BigDecimal;
import java.time.LocalDate;

public class Article {
    private String barcode;
    private String summary;
    private BigDecimal price;
    private LocalDate registrationDate;
    private String provider;

    public Article(String barcode, String summary, BigDecimal price, String provider) {
        this.barcode = barcode;
        this.summary = summary;
        this.price = price;
        this.provider = provider;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (barcode.equals(((Article) obj).barcode));
    }

    @Override
    public int hashCode() {
        return barcode.hashCode();
    }

    @Override
    public String toString() {
        return "Article{" +
                "barcode=" + barcode +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", registrationDate=" + registrationDate +
                ", provider='" + provider + '\'' +
                '}';
    }
}

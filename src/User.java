import java.awt.*;

public class User {
    private Long mobile;
    private String name;
    private String address;

    public User(Long mobile, String name, String address) {
        this.mobile = mobile;
        this.name = name;
        this.address = address;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (mobile.equals(((User) obj).mobile));
    }

    @Override
    public int hashCode() {
        return mobile.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "mobile=" + mobile +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

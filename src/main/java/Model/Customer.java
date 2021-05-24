package Model;

public class Customer {
    private String name;
    private String brithday;
    private String address;
    private String urlOfImage;

    public Customer() {
    }

    public Customer(String name, String brithday, String address, String urlOfImage) {
        this.name = name;
        this.brithday = brithday;
        this.address = address;
        this.urlOfImage = urlOfImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlOfImage() {
        return urlOfImage;
    }

    public void setUrlOfImage(String urlOfImage) {
        this.urlOfImage = urlOfImage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", brithday='" + brithday + '\'' +
                ", address='" + address + '\'' +
                ", urlOfImage='" + urlOfImage + '\'' +
                '}';
    }
}

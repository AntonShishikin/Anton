public class Phone extends Products{
    private float cameraMP;
    Phone(double price, String name, String country, Types type, float cameraMP) {
        super(price, name, country, type);
        this.cameraMP = cameraMP;
    }

    @Override
    public String displayInfo() {
        return "Phone {" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Country: " + getCountry() +
                ", Camera: " + getCameraMP() +"Megapixels" +
                ", Type:" +getType()+
                "}";
    }

    public float getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(float cameraMP) {
        this.cameraMP = cameraMP;
    }
}

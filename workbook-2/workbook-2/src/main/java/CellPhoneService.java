public class CellPhoneService {

    private long serial;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;




    public CellPhoneService() {
         long serial = 0;
         String model = "";
         String carrier = "";
         String phoneNumber = "";
         String owner = "";
    }

    public CellPhoneService(long serial, String model, String carrier
            ,String phoneNumber, String owner){
        this.serial = serial;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public long getSerial(){
        return serial;
    }

public void setSerial(long serial){
        this.serial = serial;
}

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getCarrier(){
        return carrier;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public String getPhoneNumberl(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }







}

package class_;

public class Dispositivo {
    private String idDevice;
    private String modelo;
    private String mark;
    private String imei;
    private String password;
    private String failure;
    private String state;

    public Dispositivo() {

    }

    public Dispositivo(String idDevice, String modelo, String mark, String imei, String password, String failure, String state) {
        this.idDevice = idDevice;
        this.modelo = modelo;
        this.mark = mark;
        this.imei = imei;
        this.password = password;
        this.failure = failure;
        this.state = state;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "idDevice='" + idDevice + '\'' +
                ", mark='" + mark + '\'' +
                ", imei='" + imei + '\'' +
                ", password='" + password + '\'' +
                ", failure='" + failure + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}


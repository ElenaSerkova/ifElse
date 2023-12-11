package lesson16;

public class Phone {

    private int imei;

    private SimCard simCard;

    private String model;

    private String casePhone;

    public Phone(int imei,  String model) {
        this.imei = imei;
        this.model = model;
    }

    public String getCasePhone() {
        return casePhone;
    }

    public void setCasePhone(String casePhone) {
        this.casePhone = casePhone;
    }

    public int getImei() {
        return imei;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + simCard +
                ", model='" + model + '\'' +
                '}';
    }


}

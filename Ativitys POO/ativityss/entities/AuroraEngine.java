package entities;

public class AuroraEngine {
    private String loginName; //Nome de quem está acessando
    private String loginPassword; //Senha correspondente
    private String carModel; //Modelo do carro
    private String carName; //Nome do carro
    private int carID; //Id do carro é derivado de outros modelos (cada modelo tem um id especifico)
    private int carLicensePlate; //Placa do carro
    private String month; //Mês

    /* public String getString */

    public AuroraEngine(){
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

    public AuroraENGINE(String carModel, String carName, int carID, int carLicensePlate){
        this.carModel = carModel;
        this.carName = carName;
        this.carLicensePlate = carLicensePlate;
    }

    public String getCarModel(){
        return carModel;    
    }

    public String getCarName(){
        return carName;
    }

    public int getCarID(){
        return carID;
    }

    public int getCarLicensePlate(){
        return carLicensePlate;
    }
}

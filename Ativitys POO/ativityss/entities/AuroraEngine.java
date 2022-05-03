package entities;

public class AuroraEngine {
    private String loginName; //Nome de quem está acessando
    private String loginPassword; //Senha correspondente
    private String carModel; //Modelo do carro
    private String carName;
    private String month;

    /* public String getString */

    public AuroraENGINE(String loginName, String loginPassword, String carModel, String carName, String month){
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.carModel = carModel;
        this.carName = carName;
    }

    public String getMonth(){
        if(month == "1"){
            return "Janeiro";   
        }
        else if(month == "2"){
            return "Fevereiro";
        }
        return month;
    }
    
}

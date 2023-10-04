public class Car {
    private int car_number;
    private String model_name;
    private int chaNumber;
    final int mileage=10000;

    public int GetCarNumber(){
        return car_number;
    }
    public void SetCarNumber(int CarNumber){
        this.car_number=CarNumber;
    }

    public String GetModelName(){
        return model_name;
    }
    public void SetModelName(String ModelName){
        this.model_name=ModelName;
    }
    public int GetChaNumber(){
        return chaNumber;
    }
    public void SetChaNumber(int ChaNumber){
        this.chaNumber=ChaNumber;
    }

    public void ShowDetails(){
        System.out.println("Car Number is "+ car_number);
        System.out.println("Model Name is "+ model_name);
        System.out.println("Chas Number is "+ chaNumber);
        System.out.println("Mileage is "+ mileage);

    }


}
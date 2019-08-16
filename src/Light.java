public class Light {
    boolean lightSwitchPosition;
    static String time = "Day";
    String lightName = "Bed Light";
    int numberofBedlight = 2;
    int x;

    public Light() {
        System.out.println("This is default constractor");
    }

    public void turnOnLight() {
        lightSwitchPosition = true;
        System.out.println("Light is turned on ");

    }

    public void turnOffLight() {
        lightSwitchPosition = false;
        System.out.println("The light is urned off ");
    }

    public static void main(String[] args) {

        Light bedLight = new Light();
        if (time == "Night") {
            bedLight.turnOffLight();
        }

      else{

            bedLight.turnOnLight();
        }

    }
    }











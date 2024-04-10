package Fan;
/*
(The Fan class) Design a class named Fan to represent a fan. The class contains:
■■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3
to denote the fan speed.
■■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).
■■ A private boolean data field named on that specifies whether the fan is on (the
default is false).
■■ A private double data field named radius that specifies the radius of the fan
(the default is 5).
■■ A string data field named color that specifies the color of the fan (the default
is blue).
■■ The accessor and mutator methods for all four data fields. // Get/set
■■ A no-arg constructor that creates a default fan.
■■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
 */

public class Fan {
    public static final int slow = 1;
    public static int medium = 2;
    public static int fast = 3;

    private int fanSpeed = slow;

    private boolean isFanOn;

    private double radiusFan;

    private String color;

    public Fan() {
        fanSpeed = 1;
        isFanOn = false;
        radiusFan = 5.0;
        color = "blue";
    }
    public Fan(int fanSpeed, boolean isFanOn, double radiusFan, String color) {
        this.fanSpeed = fanSpeed;
        this.isFanOn = isFanOn;
        this.radiusFan = radiusFan;
        this.color = color;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        if (fanSpeed == 2) {
            fanSpeed = medium;
        }
        if (fanSpeed == 3) {
            fanSpeed = fast;
        } else {
            fanSpeed = 1;
        }
    }

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
        if (isFanOn == true) {
            isFanOn = true;
        } else {
            isFanOn = false;
        }
    }

    public double getRadiusFan() {
        return radiusFan;
    }

    public void setRadiusFan(double radiusFan) {
        this.radiusFan = radiusFan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
■■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.
 */
    @Override
    public String toString() {
        String speedStr;
        if (fanSpeed == slow) speedStr = "slow";

        if (isFanOn == true) {
            return "Fan\n" +
                    "Fan speed: " + fanSpeed +
                    " | Is fan on: " + isFanOn +
                    " | Radius fan: " + radiusFan +
                    " | Color: " + color;
        } else {
            return "Fan\n" +
                    " | Fan is off." +
                    " | Radius fan: " + radiusFan +
                    " | Color: " + color;
        }
    }
}



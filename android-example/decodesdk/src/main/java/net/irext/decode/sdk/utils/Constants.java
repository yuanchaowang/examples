package net.irext.decode.sdk.utils;

/**
 * Filename:       Constants.java
 * Revised:        Date: 2017-04-03
 * Revision:       Revision: 1.0
 * <p>
 * Description:    SDK Constants
 * <p>
 * Revision log:
 * 2017-04-03: created by strawmanbobi
 */
public class Constants {

    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_NETWORK_ERROR = -1;

    public static final int ERROR_CODE_AUTH_FAILURE = 1;
    public static final int ERROR_CODE_INVALID_CATEGORY = 2;
    public static final int ERROR_CODE_INVALID_BRAND = 3;
    public static final int ERROR_CODE_INVALID_PARAMETER = 4;
    public static final int ERROR_CODE_INVALID_CITY = 5;
    public static final int ERROR_CODE_INVALID_OPERATOR = 6;

    public static final int ERROR_CODE_INVALID_SESSION = 20;

    public static final String ERROR_CODE_SUCESS_TEXT = "success";
    public static final String ERROR_CODE_NETWORK_ERROR_TEXT = "network error";
    public static final String ERROR_CODE_AUTH_FAILUTRE_TEXT = "auth failure";
    public static final String ERROR_CODE_INVALID_CATEGORY_TEXT = "invalid category";
    public static final String ERROR_CODE_INVALID_BRAND_TEXT = "invalid brand";
    public static final String ERROR_CODE_INVALID_PARAMETER_TEXT = "invalid parameter";

    public static final String ERROR_CODE_INVALID_SESSION_TEXT = "invalid decode session";

    public enum CategoryID {
        AIR_CONDITIONER(1),
        TV(2),
        STB(3),
        NET_BOX(4),
        IPTV(5),
        DVD(6),
        FAN(7),
        PROJECTOR(8),
        STEREO(9),
        LIGHT(10),
        BSTB(11),
        CLEANING_ROBOT(12),
        AIR_CLEANER(13);

        private final int id;

        CategoryID(int id) {
            this.id = id;
        }

        public int getValue() {
            return id;
        }
    }

    public enum BinaryType {
        TYPE_BINARY(0),
        TYPE_HEXDECIMAL(1);

        private final int type;

        BinaryType(int type) {
            this.type = type;
        }

        public int getValue() {
            return type;
        }
    }

    public enum ACPower {
        POWER_ON(0),
        POWER_OFF(1);

        private final int power;

        ACPower(int power) {
            this.power = power;
        }

        public int getValue() {
            return power;
        }
    }

    public enum ACMode {
        MODE_COOL(0),
        MODE_HEAT(1),
        MODE_AUTO(2),
        MODE_FAN(3),
        MODE_DEHUMIDITY(4);

        private final int mode;

        ACMode(int mode) {
            this.mode = mode;
        }

        public int getValue() {
            return mode;
        }
    }

    public enum ACTemperature {
        TEMP_16(0),
        TEMP_17(1),
        TEMP_18(2),
        TEMP_19(3),
        TEMP_20(4),
        TEMP_21(5),
        TEMP_22(6),
        TEMP_23(7),
        TEMP_24(8),
        TEMP_25(9),
        TEMP_26(10),
        TEMP_27(11),
        TEMP_28(12),
        TEMP_29(13),
        TEMP_30(14);

        private final int temp;

        ACTemperature(int temp) {
            this.temp = temp;
        }

        public int getValue() {
            return temp;
        }
    }

    public enum ACWindSpeed {
        SPEED_AUTO(0),
        SPEED_LOW(1),
        SPEED_MEDIUM(2),
        SPEED_HIGH(3);

        private final int speed;

        ACWindSpeed(int speed) {
            this.speed = speed;
        }

        public int getValue() {
            return speed;
        }
    }

    public enum ACSwing {
        SWING_ON(0),
        SWING_OFF(1);

        private final int swing;

        ACSwing(int swing) {
            this.swing = swing;
        }

        public int getValue() {
            return swing;
        }
    }

    public enum ACFunction {
        FUNCTION_SWITCH_POWER(1),
        FUNCTION_CHANGE_MODE(2),
        FUNCTION_TEMPERATURE_UP(3),
        FUNCTION_TEMPERATURE_DOWN(4),
        FUNCTION_SWITCH_WIND_SPEED(5),
        FUNCTION_SWITCH_WIND_DIR(6),
        FUNCTION_SWITCH_SWING(7);

        private final int function;

        ACFunction(int function) {
            this.function = function;
        }

        public int getValue() {
            return function;
        }
    }
}

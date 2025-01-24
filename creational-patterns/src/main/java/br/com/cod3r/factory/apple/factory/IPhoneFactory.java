package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public abstract class IPhoneFactory {

    public static final String IPHONE_X = "X";
    public static final String IPHONE_11 = "11";
    public static final String STANDART = "standart";
    public static final String HIGH_END = "highEnd";

    public static IPhone orderIphone(String gen, String level) {
        IPhone device = null;

        if(IPHONE_X.equals(gen)) {
            if(STANDART.equals(level)) {
                device = new IPhoneX();
            } else if (HIGH_END.equals(level)) {
                device = new IPhoneXSMax();
            }
        } else if (IPHONE_11.equals(gen)) {
            if(STANDART.equals(level)) {
                device = new IPhone11();
            } else if (HIGH_END.equals(level)) {
                device = new IPhone11Pro();
            }
        }

        if(device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();

			return device;
		}

        return null;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator2 {

    private String binaryCode;
    private final Signal[] signals = {Signal.JUMP, Signal.CLOSE_YOUR_EYES, Signal.DOUBLE_BLINK, Signal.WINK};

    public String getBinaryCode() {
        return binaryCode;
    }

    public List<Signal> calculateHandshake(int number) {
        this.binaryCode = Integer.toBinaryString(number);
        int startIndex = binaryCode.length() >= 5 ? 0 : signals.length - binaryCode.length();
        List<Signal> list = new ArrayList<>();
        Signal[] subSignal = Arrays.copyOfRange(signals, startIndex, signals.length);
        int length = binaryCode.length() - 5;
        if (binaryCode.length() >= 5) {
            for (int i = binaryCode.length() - 1; i > length; i--) {
                if (binaryCode.charAt(i) == '1') {
                    list.add(subSignal[i - length - 1]);
                }
            }
            if (binaryCode.charAt(length) == '1'){
                Collections.reverse(list);
            }
        }
        else{
            for(int i = binaryCode.length()-1; i >= 0; i--){
                if(binaryCode.charAt(i) == '1'){
                    list.add(subSignal[i]);
                }

            }
        }

        return list;
    }


}

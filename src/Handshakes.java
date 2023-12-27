import java.util.List;

public class Handshakes {
    public static void main(String[] args) {
        HandshakeCalculator secretHandshake = new HandshakeCalculator();
        List<Signal> finalCode =  secretHandshake.calculateHandshake(16);
        System.out.printf("Number 16 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(2);
        System.out.printf("Number 2 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(6);
        System.out.printf("Number 6 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(9);
        System.out.printf("Number 9 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(26);
        System.out.printf("Number 26 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(24);
        System.out.printf("Number 24 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(51);
        System.out.printf("Number 51 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        finalCode =  secretHandshake.calculateHandshake(31);
        System.out.printf("Number 31 in binary code = %s and secret handshake includes: %s%n", secretHandshake.getBinaryCode(),finalCode.toString());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

    }
}

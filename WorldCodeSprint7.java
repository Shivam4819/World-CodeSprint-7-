
package world.codesprint7;

import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class WorldCodeSprint7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TwoCharacter twocharacter=new TwoCharacter();
        twocharacter.twoCharacterString();
        
        SockMerchant sock=new SockMerchant();
        sock.sockPairs();

        GridlandTrain gridLand = new GridlandTrain();
        gridLand.lampPost();
    }
}

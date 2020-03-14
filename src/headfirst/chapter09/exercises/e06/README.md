**Defective detective**

Here is the source code that simulates and tests our space station.
We need to double check all that we can in our heating and cooling machines for our main module.
Everything seems to be ideally prepared and checked, 
but the temperature of the main module in the simulation keeps falling.
We have started the simulation four times already and still get the same result: 
falling temperature and excess energy consumption.

**Find whats wrong with the system and fix it!**

We definitely need 2:1 proportion of v3 and v2 radiators.
And the global amount of heating units should match the cooling units as 4:3.
Designed energy consumption is 3:2 taking into account that cooling units use more energy.

    import java.util.*;
    class V2Radiator {
        V2Radiator(ArrayList list) {
            for (int x = 0; x < 5; x++) {
                list.add(new SimUnit("V2Radiator"));
            }
        }
    }
    
    class V3Radiator extends V2Radiator {
        V3Radiator(ArrayList lglist) {
            super(lglist);
            for (int g = 0; g < 10; g++) {
                lglist.add(new SimUnit("V3Radiator"));
            }
        }
    }
    
    class RetentionBot {
        RetentionBot(ArrayList rlist) {
            rlist.add(new SimUnit("Heating machine"));
        }
    }
    
    class SimUnit {
        String botType;
        
        SimUnit(String type) {
            botType = type;
        }
        
        int powerUse() {
            if ("Heating machine".equals(botType)) {
                return 2;
            } else {
                return 4;
            }
        }
    }
    
    public class TestLifeSupportSim {
        public static void main(String[] args) {
            ArrayList aList = new ArrayList();
            V2Radiator v2 = new V2Radiator(aList);
            V3Radiator v3 = new V3Radiator(aList);
            for (int z = 0; z < 20; z++) {
                RetentionBot ret = new RetentionBot(aList);
            }
        }
    }
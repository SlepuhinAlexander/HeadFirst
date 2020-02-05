/*
* It was expected that the Life Support System would consist of:
* - 20 Heating machines;
* - 10 V3 Radiators;
* - 5 V2 Radiators.
* The power usage was supposed to be: 20 * 2 + 10 * 4 + 5 * 4 = 100 units.
*
* In fact the Testing Simulation creates:
* - 20 Heating machines;
* - 10 V3 radiators;
* - 10 V2 radiators;
* And the actual poser usage is: 20 * 2 + 10 * 4 + 10 * 4 = 120 units. Which is 20% higher than expected.
* And obviously, additional coolers imbalance the life support and constantly lower the temperature.
*
* The problem lies in V2Radiator and V3Radiation constructors.
* When we create a V3 unit it instantly creates additional parent V2 unit.
* Since V3 inherit V2 we must call a constructor for its parent.
*
* The solution would lie in creating an empty constructor for V2Radiator
* and calling it (automatically) from V3Radiator constructor.
*  */

package headfirst.chapter9.exercises.e6;

import java.util.ArrayList;

class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }

    public V2Radiator() {
    }
}

class V3Radiator extends V2Radiator {
    V3Radiator(ArrayList lglist) {
        // auto call super(); -- constructor of the parent class.
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
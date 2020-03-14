**Backwards programming**

Assume this code is placed in one Java-file.
You are to fill in the gaps so that the program compiles and outputs the given text.

    import ___________;
    
    public class SortMountains {
        LinkedList__________ mtn = new LinkedList__();
    
        public static void main(String[] args) {
            new SortMountains().go();
        }
    
        public void go() {
            mtn.add(new Mountain("Long Range", 14255));
            mtn.add(new Mountain("Elbert", 14433));
            mtn.add(new Mountain("Maroon", 14156));
            mtn.add(new Mountain("Castle", 14265));
            System.out.println("By adding order:\n" + mtn);
            NameCompare nc = new NameCompare();
            _________________________;
            System.out.println("By name:\n" + mtn);
            HeightCompare hc = new HeightCompare();
            _________________________;
            System.out.println("By height:\n" + mtn);
    
        }
    
        class NameCompare _______________________________ {
            public int compare(Mountain one, Mountain two) {
                return ____________________________;
            }
        }
    
        class HeightCompare _______________________________ {
            public int compare(Mountain one, Mountain two) {
                return _______________________;
            }
        }
    }
    
    class Mountain {
        ___________;
        __________;
    
        ________________________________ {
            ________;
            __________;
        }
    
        ________________________ {
            __________________________;
        }
    }

**Output:**

    % java SortMountains
    By adding order:
    [Long Range 14255, Elbert 14433, Maroon 14156, Castle 14265]
    By name:
    [Castle 14265, Elbert 14433, Long Range 14255, Maroon 14156]
    By height:
    [Elbert 14433, Castle 14265, Long Range 14255, Maroon 14156]
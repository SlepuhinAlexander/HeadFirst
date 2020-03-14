**Match reference variables with the corresponding object(s)**

Several reverence variables were created and changed in the given code example.
Your goal is to find which variable refers to which object.
Not all references would be used.
And come objects may be referenced several times.

    class HeapQuiz {
        int id = 0;
        
        public static void main(String[] args) {
            int x = 0;
            HeapQuiz[] hq = new HeapQuiz[5];
            while (x < 3) {
                hq[x] = new HeapQuiz();
                hq[x].id = x;
                x = x + 1;
            }
            hq[3] = hq[1];  
            hq[4] = hq[1];  
            hq[3] = null;  
            hq[4] = hq[0];  
            hq[0] = hq[3];  
            hq[3] = hq[2];  
            hq[2] = hq[0];
            
            // do something else
        }
    }  

**Reference variables**

    hq[0]
    hq[1]
    hq[2]
    hq[3]
    hq[4]

**Objects in the Heap**

    HeapQuiz with id = 0
    HeapQuiz with id = 1
    HeapQuiz with id = 2
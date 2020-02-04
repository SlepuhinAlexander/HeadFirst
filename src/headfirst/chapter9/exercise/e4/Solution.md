    copyGC = null;

It would not compile, the variable copyGC is unknown (not declared).

----
    gc2 = null;

Yes, the object referred by gc2 would become a candidate for garbage collector.

----
    newGC = gc3;

It would not compile, the variable newGC is unknown (out of scope).

----
    gc1 = null;

Yes, the object referred by gc1 would become a candidate for garbage collector.

----
    newGC = null;

It would not compile, the variable newGC is unknown (out of scope).

----
    gc4 = null;

No, gc4 was not the last reference to that object.

----
    gc3 = gc2;

No, gc3 was not the last reference to that object.

----
    gc1 = gc4;

Yes, the object referred by gc1 would become a candidate for garbage collector.

----
    gc3 = null;
    
No, gc3 was not the last reference to that object.
**Polymorphic exceptions puzzle**

Here is the correct hierarchy schema of exception classes.
Assume that some `doRisky()` method can throw any of these exceptions.
Suggest at least two try/catch code blocks that would cover all risks.

    class BazEx extends Exception { }
    
    class FooEx extends BazEx { }
    
    class BarEx extends FooEx { }
    
    class BiffEx extends FooEx { }
    
    class BoinkEx extends BiffEx { }
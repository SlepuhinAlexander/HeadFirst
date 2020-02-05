The file would not compile since StaticSuper class constructor is improperly declared.
The correct version would be:

    StaticSuper() {
        System.out.println("Parent constructor")
    }
    
The correct output would be the second one:

    % java StaticTests
    Parent static block
    Static block 4
    Inside main
    Parent constructor
    Constructor
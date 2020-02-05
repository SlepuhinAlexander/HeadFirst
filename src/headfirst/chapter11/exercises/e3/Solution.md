There are **16** possible try/catch block to cover all exceptions.

    // 1.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 2.
    try {
        doRisky();
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 3.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 4.
    try {
        doRisky();
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 5.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 6.
    try {
        doRisky();
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 7.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 8.
    try {
        doRisky();
    } catch (FooEx foo) {
        // recovery code after FooEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 9.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 10.
    try {
        doRisky();
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 11.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 12.
    try {
        doRisky();
    } catch (BarEx bar) {
        // recovery code after BarEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 13.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 14.
    try {
        doRisky();
    } catch (BiffEx biff) {
        // recovery code after BiffEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 15.
    try {
        doRisky();
    } catch (BoinkEx boink) {
        // recovery code after BoinkEx
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
<!-- -->
    // 16.
    try {
        doRisky();
    } catch (BazEx baz) {
        // recovery code after BazEx
    }
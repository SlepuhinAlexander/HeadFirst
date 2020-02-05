**Polymorphic exceptions puzzle**

Suppose that given try/catch blocks are correct.
Suggest at least two hierarchy schemas of exception classes that would correspond to given try/catch blocks.

    try {
        x.doRisky();
    } catch (AplhaEx a) {
        // recovery code after AlphaEx
    } catch (BetaEx b) {
        // recovery code after BetaEx
    } catch (GammaEx c) {
        // recovery code after GammaEx
    } catch (DeltaEx d) {
        // recovery code after DeltaEx
    }
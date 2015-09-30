package foundation.omni.test.consensus.remote_core.msc

import foundation.omni.test.consensus.remote_core.CompareCoreCoreBaseSpec
import spock.lang.Ignore
import spock.lang.Title

import static foundation.omni.CurrencyID.MSC

/**
 * Local Omni Core vs Remote Omni Core consensus comparison for <code>MSC</code>
 */
@Title("Compare Omni Core vs. Remote Omni Core (e.g. stable/last revision)")
@Ignore("Until we get a new test host")
class CompareCoreCoreSpec extends CompareCoreCoreBaseSpec {

    void setupSpec() {
        setupCoreCoreComparisonForCurrency(MSC)
    }
}
